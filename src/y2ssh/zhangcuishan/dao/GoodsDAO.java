package y2ssh.zhangcuishan.dao;

import java.util.List;

import y2ssh.zhangcuishan.entity.Goods;

public interface GoodsDAO {
	public void add(Goods item);
	public void del(java.io.Serializable key);
	public void update(Goods item);
	public Goods get(java.io.Serializable key);
	public List search(Goods condition);
//	/**
//	 * 
//	 * @return
//	 */
//	public List getUnSaleGoodsList();
}
