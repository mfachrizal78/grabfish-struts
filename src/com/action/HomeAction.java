package com.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.ProfileBean;
import com.model.Profile;
import com.model.User;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;
import com.utils.CommonUtility; 

public class HomeAction extends CommonActionSupport implements ModelDriven<ProfileBean>{

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
	
	//business logic
	public String execute() {
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
		return SUCCESS;
	}
}
