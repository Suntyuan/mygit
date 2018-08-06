package y2ssh.zhangcuishan.biz.impl;

import java.util.List;

import y2ssh.zhangcuishan.biz.GoodsBiz;
import y2ssh.zhangcuishan.dao.GoodsDAO;
import y2ssh.zhangcuishan.dao.UserDAO;
import y2ssh.zhangcuishan.dao.hibimpl.GoodsDAOHibimpl;
import y2ssh.zhangcuishan.dao.hibimpl.UserDAOHibimpl;
import y2ssh.zhangcuishan.entity.Goods;
import y2ssh.zhangcuishan.entity.User;

public class GoodsBizImpl implements GoodsBiz {
	private GoodsDAO goodsDAO = new GoodsDAOHibimpl();
	
	private UserDAO userDAO = new UserDAOHibimpl();
	
	public void addGoods(Goods item,long salerId) {
		User saler = this.userDAO.get(salerId);
		if (saler==null){
			return ;
		}
		item.setSaler(saler);
		this.goodsDAO.add(item);
	}

	public void delGoods(Long key) {
		this.goodsDAO.del(key);
	}


	public List getMyGoodsList(Long userId) {
		Goods condition = new Goods();
		User saler = this.userDAO.get(userId);
		condition.setSaler(saler);
		List ret = this.goodsDAO.search(condition);
		return ret;
	}

	public List getOnSaleGoodsList() {
		Goods condition = new Goods();
		condition.setGoodsStatus(GoodsBiz.GOODS_STATUS_ON_SALE);
		List ret = this.goodsDAO.search(condition);
		return ret;
	}


}
