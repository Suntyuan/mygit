package y2ssh.zhangcuishan.biz;

import y2ssh.zhangcuishan.entity.Goods;
import y2ssh.zhangcuishan.entity.User;

public interface BidBiz {
	/**
	 * 出价状态：正常
	 */
	public static final int BID_STATUS_NORMAL = 1;
	/**
	 * 出价状态：被货主确认成交
	 */
	public static final int BID_STATUS_DEAL = 2;
	/**
	 * 添加出价
	 * @param item
	 */
	public void addBid(Goods goods,User buyer,double price);
	/**
	 * 成交
	 * @param item
	 */
	public void deal(long id);
}
