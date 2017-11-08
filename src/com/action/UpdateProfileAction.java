package com.action;
 

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.ProfileBean;
import com.model.Profile;
import com.model.User;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;
import com.utils.CommonUtility;
import com.utils.Encrypte; 

public class UpdateProfileAction extends CommonActionSupport implements ModelDriven<ProfileBean>{

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

	public String input() throws Exception { 
		User user = getUser();
		if (user!=null) {
			user = userService.findByUsername(user.getUsername());
			
			profileBean.setUsername(user.getUsername());
			Profile profile = user.getProfile();
			profileBean.setEmail(user.getEmail());
			profileBean.setName(profile.getName());
			profileBean.setDob(CommonUtility.formatDate(profile.getDob()));
			profileBean.setOrigin(profile.getOrigin());
			profileBean.setPhone(profile.getPhone());
			profileBean.setAddress1(profile.getAddress1());
			profileBean.setAddress2(profile.getAddress2());
			profileBean.setAddress3(profile.getAddress3());
			profileBean.setPostalCode(profile.getPostalCode());
			profileBean.setCountry(profile.getCountry());
			profileBean.setBankCode(profile.getBankCode());
			profileBean.setAccountNumber(profile.getAccountNumber());
		} 
		return INPUT;
	}
	
	public String execute() throws Exception { 
		
//		User user = getUser();
		User user = userService.findByUsername(this.getUser().getUsername());
		
		user.setEmail(profileBean.getEmail());
		this.setUser(user);
		this.setUpdateModel(user);
		
		Profile profile = user.getProfile();
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
		this.setUpdateModel(profile);
		user.setProfile(profile);
		profile.setUser(user);
		userService.saveUser(user); 
		return SUCCESS;
	}
	
	
}
