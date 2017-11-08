package com.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.LoginBean;
import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;
import com.utils.Encrypte;

public class LoginAction extends CommonActionSupport implements ModelDriven<LoginBean>{

	
	private static final Logger logger = Logger.getLogger(LoginAction.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private LoginBean loginBean;
	
	@Autowired
	private UserService userService;
 
	public String execute() throws Exception {  
        return SUCCESS;
	}
	 
	
	public String login() throws Exception {
		String username = loginBean.getUsername();
		User user = userService.findByUsername(username);
 
		if (user!=null) {
			String pwd = Encrypte.getEncrypt(username, loginBean.getPassword());
			if (pwd.equalsIgnoreCase(user.getPassword())) { 
				this.setUser(user);
				return SUCCESS;        
			} else {
	            return INPUT;
			}
        } else {
            return INPUT;
        }
	}
	 
	
	@Override
	public LoginBean getModel() {  
		return loginBean;
	}
	
	
 

}
