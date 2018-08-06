package y2ssh.zhangcuishan.dao.hibimpl;

import java.io.Serializable;
import java.util.List;

import y2ssh.zhangcuishan.dao.GoodsDAO;
import y2ssh.zhangcuishan.entity.Goods;

public class GoodsDAOHibimpl extends BaseHibernateDAO implements GoodsDAO {
	public void add(Goods item) {
		super.add(item);
	}
	public void del(Serializable key) {
		super.del(key, Goods.class);
	}
	public Goods get(Serializable key) {
		Goods item = (Goods)super.get(key, Goods.class);
		return item;
	}
	public List search(Goods condition) {
		List ret = super.search(condition, Goods.class);
		return ret;
	}
	public void update(Goods item) {
		super.update(item);
	}
	
}
