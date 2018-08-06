package y2ssh.zhangcuishan.dao;


import java.util.List;

import y2ssh.zhangcuishan.entity.User;

public interface UserDAO {
	public User get(java.io.Serializable key);
	public void add(User item);
	public List search(User condition);
}
