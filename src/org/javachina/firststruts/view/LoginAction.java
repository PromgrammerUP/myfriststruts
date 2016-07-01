package org.javachina.firststruts.view;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		LoginForm loginForm = (LoginForm)form;
		String userId = loginForm.getUserId();
		String pwd = loginForm.getPwd();
		String userIdFromDb = "scott";
		String pwdFromDb = "tiger";
		if(userId.equals(userIdFromDb)&&pwd.equals(pwdFromDb)){
			return mapping.findForward("success");
			//request.getRequestDispatcher("/success.jsp").forward(request, response);
		}else{
			return mapping.findForward("fail");
			//response.sendRedirect(request.getContextPath()+"/fail.jsp");
		}
		//return null;
		
	}
}