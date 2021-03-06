/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package y2ssh.zhangcuishan.web.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import y2ssh.zhangcuishan.biz.UserBiz;
import y2ssh.zhangcuishan.biz.impl.UserBizImpl;
import y2ssh.zhangcuishan.entity.User;
import y2ssh.zhangcuishan.web.form.UserForm;

/** 
 * MyEclipse Struts
 * Creation date: 08-03-2007
 * 
 * XDoclet definition:
 * @struts.action
 */
public class UserAction extends DispatchAction {
	private UserBiz userBiz = new UserBizImpl();
	
	/**
	 * 转到用户注册页面
	 * 如果agree参数不为true，就转到用户协议页面，否则转到用户信息填写的页面
	 */
	public ActionForward toAdd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		String agree = request.getParameter("agree");
		if ("true".equals(agree)){
			return mapping.findForward("user");
		}else{
			return mapping.findForward("agree");
		}
	}
	public ActionForward doAdd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		UserForm myForm = (UserForm)form;
		User item = myForm.getItem();
		if ( this.userBiz.isExists(item.getUserName()) ){
			request.setAttribute("msg", "<li>用户名已存在</li>");
			return mapping.findForward("user");
		}else{
			this.userBiz.add(item);
			request.setAttribute("msg", "<li>添加用户成功！</li>");
			request.setAttribute("backurl", "index.jsp");
			request.setAttribute("backname", "首页登录");
			return mapping.findForward("success");
		}		
	}
	
	public ActionForward doLogin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		ActionForward af = null;
		request.getSession().removeAttribute("user");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User item = this.userBiz.login(username, password);
		if (null!=item && item.getUserStatus()!=UserBiz.USER_STATUS_FORBID){//登录成功
			request.getSession().setAttribute("user", item);
//			if (item.getUserStatus()==UserBiz.USER_STATUS_ADMIN){
//				response.sendRedirect("admin.jsp");
//			}else if (item.getUserStatus()==UserBiz.USER_STATUS_NORMAL){
//				response.sendRedirect("index.jsp");
//			}
			response.setCharacterEncoding("GBK");
			response.getWriter().printf("登录成功");
		}else{
			//request.setAttribute("msg", "用户名或密码错误，登陆失败！");
			//af = mapping.findForward("index");
			response.setCharacterEncoding("GBK");
			response.getWriter().printf("用户名或密码错误，登陆失败！");
		}
		return af;
	}
	public ActionForward doLogout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.getSession().removeAttribute("user");
		response.sendRedirect("index.jsp");
		return null;
	}
}