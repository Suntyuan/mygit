/**
 * 
 */
package y2ssh.zhangcuishan.dao.hibimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import y2ssh.zhangcuishan.dao.BidDAO;
import y2ssh.zhangcuishan.entity.Bid;

/**
 * @author hailong.liu
 *
 */
public class BidDAOHibimpl extends HibernateDaoSupport implements BidDAO {

	/* （非 Javadoc）
	 * @see y2ssh.zhangcuishan.dao.BidDAO#add(y2ssh.zhangcuishan.entity.Bid)
	 */
	public void add(Bid item) {
		super.getHibernateTemplate().save(item);
	}

	/* （非 Javadoc）
	 * @see y2ssh.zhangcuishan.dao.BidDAO#del(java.io.Serializable)
	 */
	public void del(Serializable key) {
		super.getHibernateTemplate().delete(
				super.getHibernateTemplate().get(Bid.class, key));
	}

	/* （非 Javadoc）
	 * @see y2ssh.zhangcuishan.dao.BidDAO#get(java.io.Serializable)
	 */
	public Bid get(Serializable key) {
		Bid item = (Bid)super.getHibernateTemplate().get(Bid.class,key);
		return item;
	}

	/* （非 Javadoc）
	 * @see y2ssh.zhangcuishan.dao.BidDAO#search(y2ssh.zhangcuishan.entity.Bid)
	 */
	public List search(Bid condition) {
		List ret = super.getHibernateTemplate().findByExample(condition);
		return ret;
	}

	/* （非 Javadoc）
	 * @see y2ssh.zhangcuishan.dao.BidDAO#update(y2ssh.zhangcuishan.entity.Bid)
	 */
	public void update(Bid item) {
		super.getHibernateTemplate().update(item);
	}

}
