package com.action;

import java.util.Map;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
  
 
public class LogoutAction extends CommonActionSupport {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception { 
    	Map session = ActionContext.getContext().getSession();
    	session.remove(USER_SESSION); 
     	session.remove("context");
        return SUCCESS;
    }
 
}