package y2ssh.zhangcuishan.dao.hibimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

public abstract class BaseHibernateDAO {
	
	protected Session getSession() {
    	return HibernateSessionFactory.getSession();  
    }
  
	protected void add(Object item){
		try {
        	Transaction tx = getSession().beginTransaction();
        	getSession().save(item);
        	tx.commit();
        } catch (RuntimeException re) {
            throw re;
        }
	}
	
	protected Object get(Serializable id,Class clazz){
		try { 
			Object item = getSession()
            	.get(clazz, id);
			return item;
        } catch (RuntimeException re) {
            throw re;
        }
	}
	
	protected void del(Serializable id,Class clazz){
		try {
        	Transaction tx = getSession().beginTransaction();
        	getSession().delete(this.get(id, clazz));
        	tx.commit();
        } catch (RuntimeException re) {
            throw re;
        }		
	}
	
	protected void update(Object item){
		try {
        	Transaction tx = getSession().beginTransaction();
        	getSession().update(item);
        	tx.commit();
        } catch (RuntimeException re) {
            throw re;
        }
	}
	
	protected List search(Object condition,Class clazz){
		try {
            List results = getSession()
                    .createCriteria(clazz)
                    .add(Example.create(condition))
            .list();
            return results;
        } catch (RuntimeException re) {
            throw re;
        }
	}
}
