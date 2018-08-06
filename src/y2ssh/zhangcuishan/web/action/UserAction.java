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
	 * ת���û�ע��ҳ��
	 * ���agree������Ϊtrue����ת���û�Э��ҳ�棬����ת���û���Ϣ��д��ҳ��
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
			request.setAttribute("msg", "<li>�û����Ѵ���</li>");
			return mapping.findForward("user");
		}else{
			this.userBiz.add(item);
			request.setAttribute("msg", "<li>�����û��ɹ���</li>");
			request.setAttribute("backurl", "index.jsp");
			request.setAttribute("backname", "��ҳ��¼");
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
		if (null!=item && item.getUserStatus()!=UserBiz.USER_STATUS_FORBID){//��¼�ɹ�
			request.getSession().setAttribute("user", item);
//			if (item.getUserStatus()==UserBiz.USER_STATUS_ADMIN){
//				response.sendRedirect("admin.jsp");
//			}else if (item.getUserStatus()==UserBiz.USER_STATUS_NORMAL){
//				response.sendRedirect("index.jsp");
//			}
			response.setCharacterEncoding("GBK");
			response.getWriter().printf("��¼�ɹ�");
		}else{
			//request.setAttribute("msg", "�û�����������󣬵�½ʧ�ܣ�");
			//af = mapping.findForward("index");
			response.setCharacterEncoding("GBK");
			response.getWriter().printf("�û�����������󣬵�½ʧ�ܣ�");
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