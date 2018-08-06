package y2ssh.zhangcuishan.biz;

import y2ssh.zhangcuishan.entity.User;

public interface UserBiz {
	/**
	 * 用户状态：正常
	 */
	public static final int USER_STATUS_NORMAL = 1;
	/**
	 * 用户状态：管理员
	 */
	public static final int USER_STATUS_ADMIN = 2;
	/**
	 * 用户状态：被禁止
	 */
	public static final int USER_STATUS_FORBID = 0;	
	
	
	public boolean isExists(String username);
	public User login(String username,String password);
	public void add(User item);
}
