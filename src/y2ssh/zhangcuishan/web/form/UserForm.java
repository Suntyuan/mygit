package y2ssh.zhangcuishan.web.form;

import org.apache.struts.action.ActionForm;

import y2ssh.zhangcuishan.entity.User;

@SuppressWarnings("serial")
public class UserForm extends ActionForm {
	
	private User item = new User();
	public User getItem() {
		return item;
	}
	public void setItem(User item) {
		this.item = item;
	}	
}