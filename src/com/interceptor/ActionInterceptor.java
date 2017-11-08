package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ActionInterceptor extends AbstractInterceptor {

    public String intercept(ActionInvocation invocation) throws Exception {
        // Do checking here, get user from session or from parameter is OK.
        // Example:
        // string returned below will be redirected to result of Struts 2 action
//        String roleName = user.getRole().getName();
//        if ("admin".equals(roleName) {
//            return "admin";
//        } else if("user".equals(roleName)) {
//            return "user";
//        }
        
        invocation.getAction().getClass().getName();

        // This means if roleName is not admin or user, the action will be invoked
        return invocation.invoke();
    }

}