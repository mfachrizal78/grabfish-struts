package com.action;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import com.model.CommonModel;
import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CommonActionSupport extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static String USER_SESSION = "USER_SESSION";
	
	public User getUser() {
	    Map<String, Object> session = ActionContext.getContext().getSession();
	    return (User) session.get(USER_SESSION);
	}
	
	public void setUser(User user) {
	    Map<String, Object> session = ActionContext.getContext().getSession();
	    session.put(USER_SESSION, user);
	}
	
	public CommonModel setSaveModel(CommonModel commonModel) {
		User user = this.getUser();
		Date today = Calendar.getInstance().getTime();
		commonModel.setCreatedBy(user.getUsername());
		commonModel.setCreatedDate(today);
		commonModel.setUpdatedBy(user.getUsername());
		commonModel.setUpdatedDate(today);
		return commonModel;		
	}

	public CommonModel setUpdateModel(CommonModel commonModel) {
		User user = this.getUser();
		Date today = Calendar.getInstance().getTime();
		commonModel.setUpdatedBy(user.getUsername());
		commonModel.setUpdatedDate(today);
		return commonModel;
		
	}
	
}
