package y2ssh.zhangcuishan.biz;

import y2ssh.zhangcuishan.entity.User;

public interface UserBiz {
	/**
	 * �û�״̬������
	 */
	public static final int USER_STATUS_NORMAL = 1;
	/**
	 * �û�״̬������Ա
	 */
	public static final int USER_STATUS_ADMIN = 2;
	/**
	 * �û�״̬������ֹ
	 */
	public static final int USER_STATUS_FORBID = 0;	
	
	
	public boolean isExists(String username);
	public User login(String username,String password);
	public void add(User item);
}
