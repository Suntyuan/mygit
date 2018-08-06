package y2ssh.zhangcuishan.biz;

import java.util.List;

import y2ssh.zhangcuishan.entity.Goods;

public interface GoodsBiz {
	/**
	 * ��Ʒ״̬�������/����
	 */
	public static final int GOODS_STATUS_ON_SALE = 1;
	/**
	 * ��Ʒ״̬���۳�
	 */
	public static final int GOODS_STATUS_OUT = 2;
	
	/**
	 * ������Ʒ�����������saler����Ϊnull��
	 * @param item
	 */
	public void addGoods(Goods item,long salerId);
	/**
	 * ɾ����Ʒ����ɾ������Ʒһ����δ���˳���
	 * @param item
	 */
	public void delGoods(Long key);
	/**
	 * ������Ʒ�б�
	 * @return
	 */
	public List getOnSaleGoodsList();
	/**
	 * �õ�ĳ�û�������������Ʒ�б���������״̬��
	 * @return
	 */
	public List getMyGoodsList(Long userId);
	
}
