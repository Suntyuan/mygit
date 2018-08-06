package y2ssh.zhangcuishan.dao.hibimpl;

import java.util.List;

import y2ssh.zhangcuishan.dao.UserDAO;
import y2ssh.zhangcuishan.entity.User;

public class UserDAOHibimpl extends BaseHibernateDAO implements UserDAO{
	public User get(java.io.Serializable key){
		User item = (User)super.get(key, User.class);
		return item;
	}

	public void add(User item) {
		super.add(item);
	}

	public List search(User condition) {
		List ret = super.search(condition, User.class);
		return ret;
	}
}
