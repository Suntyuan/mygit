//package y2ssh.zhangcuishan.biz.impl;
//
//import java.util.Date;
//
//import y2ssh.zhangcuishan.biz.BidBiz;
//import y2ssh.zhangcuishan.biz.GoodsBiz;
//import y2ssh.zhangcuishan.dao.BidDAO;
//import y2ssh.zhangcuishan.dao.GoodsDAO;
//import y2ssh.zhangcuishan.dao.hibimpl.BidDAOHibimpl;
//import y2ssh.zhangcuishan.dao.hibimpl.GoodsDAOHibimpl;
//import y2ssh.zhangcuishan.entity.Bid;
//import y2ssh.zhangcuishan.entity.Goods;
//import y2ssh.zhangcuishan.entity.User;
//
//public class BidBizImpl implements BidBiz {
//	
//	private BidDAO bidDAO = new BidDAOHibimpl();
//	private GoodsDAO goodsDAO = new GoodsDAOHibimpl();
//	
//	public void addBid(Goods goods, User buyer, double price) {
//		Bid item = new Bid();
//		item.setBidPrice(price);
//		item.setBidStatus(BidBiz.BID_STATUS_NORMAL);
//		item.setBidTime(new Date());
//		item.setBuyer(buyer);
//		item.setGoods(goods);
//		this.bidDAO.add(item);
//	}
//
//	public void deal(long id) {
//		Bid item = this.bidDAO.get(id);
//		item.setBidStatus(BidBiz.BID_STATUS_DEAL);
//		Goods goods = item.getGoods();
//		goods.setGoodsStatus(GoodsBiz.GOODS_STATUS_OUT);
//		this.goodsDAO.update(goods);
//		this.bidDAO.update(item);
//	}
//
//}
