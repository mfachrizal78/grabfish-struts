package com.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.ProfileBean;
import com.model.Profile;
import com.model.User;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;
import com.utils.CommonUtility;
import com.utils.Encrypte;

public class RegisterAction extends CommonActionSupport implements ModelDriven<ProfileBean>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private ProfileBean profileBean;
	
	@Autowired
	private UserService userService;
	
	@Override
	public ProfileBean getModel() {
		return profileBean;
	}

	public String execute() throws Exception { 
		
		User user = new User();
		String username = profileBean.getUsername();
		user.setUsername(username);
		String pwd = Encrypte.getEncrypt(username, profileBean.getPassword());
		user.setPassword(pwd);
		user.setEmail(profileBean.getEmail());
		this.setUser(user);
		this.setSaveModel(user);
		
		Profile profile = new Profile();
		profile.setName(profileBean.getName());
		Date dob = CommonUtility.parseDate(profileBean.getDob());
		profile.setDob(dob);
		profile.setOrigin(profileBean.getOrigin());
		profile.setPhone(profileBean.getPhone());
		profile.setAddress1(profileBean.getAddress1());
		profile.setAddress2(profileBean.getAddress2());
		profile.setAddress3(profileBean.getAddress3());
		profile.setCountry(profileBean.getCountry());
		profile.setPostalCode(profileBean.getPostalCode());
		profile.setBankCode(profileBean.getBankCode());
		profile.setAccountNumber(profileBean.getAccountNumber()); 
		this.setSaveModel(profile);
		user.setProfile(profile);
		profile.setUser(user);
		userService.saveUser(user);
		return SUCCESS;
	}
	
	
	public void validate() {
		
		String username = profileBean.getUsername();
		User user = userService.findByUsername(username);
		if (user!=null) {
			addFieldError("username", getText("username.exist"));
		}
		
		if (profileBean.getPassword()!=null && profileBean.getConfirmPassword()!=null) {
			if (!profileBean.getPassword().equals(profileBean.getConfirmPassword())) {
				addFieldError("confirmPassword", getText("confirmPassword.invalid"));
			}
		}
		
		if (profileBean.getDob()!=null) {
			SimpleDateFormat formatter = new SimpleDateFormat(CommonUtility.DATE_FORMAT_SIMPLE);
			if (profileBean.getDob().length()>10) {
				addFieldError("dob", getText("dob.invalid"));				
			} else {
				try {
					Date dob = formatter.parse(profileBean.getDob());
				} catch (ParseException e) {
					addFieldError("dob", getText("dob.invalid"));
				}
			}
			
		}

	}	
}
