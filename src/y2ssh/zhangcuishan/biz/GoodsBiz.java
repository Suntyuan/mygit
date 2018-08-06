package y2ssh.zhangcuishan.biz;

import java.util.List;

import y2ssh.zhangcuishan.entity.Goods;

public interface GoodsBiz {
	/**
	 * 商品状态：新添加/在售
	 */
	public static final int GOODS_STATUS_ON_SALE = 1;
	/**
	 * 商品状态：售出
	 */
	public static final int GOODS_STATUS_OUT = 2;
	
	/**
	 * 发布商品，传入参数中saler不能为null。
	 * @param item
	 */
	public void addGoods(Goods item,long salerId);
	/**
	 * 删除商品，所删除的商品一定还未有人出价
	 * @param item
	 */
	public void delGoods(Long key);
	/**
	 * 在售商品列表
	 * @return
	 */
	public List getOnSaleGoodsList();
	/**
	 * 得到某用户发布的所有商品列表，包含所有状态的
	 * @return
	 */
	public List getMyGoodsList(Long userId);
	
}
