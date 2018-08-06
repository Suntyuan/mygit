package y2ssh.zhangcuishan.biz.impl;

import java.util.List;

import y2ssh.zhangcuishan.biz.UserBiz;
import y2ssh.zhangcuishan.dao.UserDAO;
import y2ssh.zhangcuishan.dao.jdbcimpl.UserDAOJdbcImpl;
import y2ssh.zhangcuishan.entity.User;

public class UserBizImpl implements UserBiz {
	private UserDAO userDAO = new UserDAOJdbcImpl();
	
	public boolean isExists(String username) {
		User condition = new User();
		condition.setUserName(username);
		List list = this.userDAO.search(condition);
		
		if (list.size()>0){
			return true;
		}else{
			return false;
		}
	}

	public User login(String username, String password) {
		User condition = new User();
		condition.setUserName(username);
		List list = this.userDAO.search(condition);
		
		if (list.size() == 1){
			User item = (User)list.get(0);
			if (item.getUserPassword().equals(password))
			{
				return item;
			}
		}
		return null;
	}

	public void add(User item) {
		this.userDAO.add(item);
	}

}
