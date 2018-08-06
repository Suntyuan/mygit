package y2ssh.zhangcuishan.dao;

import java.util.List;

import y2ssh.zhangcuishan.entity.Bid;

public interface BidDAO {
	public void add(Bid item);
	public void del(java.io.Serializable key);
	public void update(Bid item);
	public Bid get(java.io.Serializable key);
	public List search(Bid condition);
}
