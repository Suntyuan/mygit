package y2ssh.zhangcuishan.biz;

import y2ssh.zhangcuishan.entity.Goods;
import y2ssh.zhangcuishan.entity.User;

public interface BidBiz {
	/**
	 * ����״̬������
	 */
	public static final int BID_STATUS_NORMAL = 1;
	/**
	 * ����״̬��������ȷ�ϳɽ�
	 */
	public static final int BID_STATUS_DEAL = 2;
	/**
	 * ��ӳ���
	 * @param item
	 */
	public void addBid(Goods goods,User buyer,double price);
	/**
	 * �ɽ�
	 * @param item
	 */
	public void deal(long id);
}
