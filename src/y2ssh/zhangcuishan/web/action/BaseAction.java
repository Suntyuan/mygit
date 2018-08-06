package y2ssh.zhangcuishan.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.actions.DispatchAction;

import y2ssh.zhangcuishan.entity.User;

public class BaseAction extends DispatchAction {
	public Long getCurrUserId(HttpServletRequest request){
		User user = this.getCurrUser(request);
		if (null==user){
			return new Long(-1);
		}
		else{
			return user.getUserId();
		}
	}
	public User getCurrUser(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute("user");
		return user;
	}
}
