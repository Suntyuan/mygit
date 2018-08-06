package y2ssh.zhangcuishan.dao.jdbcimpl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import y2ssh.zhangcuishan.dao.UserDAO;
import y2ssh.zhangcuishan.entity.User;

public class UserDAOJdbcImpl extends BaseJdbcDAO implements UserDAO {

	public void add(User item) {
		openConn();
        String sql = "INSERT INTO [t_user] (user_name, user_password, user_id_code, user_tel, user_addr, user_zip, user_status) " +
        			 "VALUES ( ?, ?, ?, ?, ?, ?, ? )";
        try {
            pstmt = conn.prepareStatement(sql);
            int index = 1;
            pstmt.setString(index++, item.getUserName());
            pstmt.setString(index++, item.getUserPassword());
            pstmt.setString(index++, item.getUserIdCode());
            pstmt.setString(index++, item.getUserTel());
            pstmt.setString(index++, item.getUserAddr());
            pstmt.setString(index++, item.getUserZip());
            pstmt.setInt(index++, item.getUserStatus());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeAll();
	}

	
	@SuppressWarnings("unchecked")
	public List search(User condition) {
		List list = new ArrayList();
		String sql = "SELECT user_id,user_name, user_password, user_id_code, user_tel, user_addr, user_zip, user_status " +
        			 "FROM [t_user] WHERE 1=1 ";
        if (condition!=null){
        	if (condition.getUserId()!=0){
        		sql += "AND user_id = " + condition.getUserId();
        	}
        	if (condition.getUserName()!=null && !condition.getUserName().trim().equals("")){
        		sql += "AND user_name like '%" + condition.getUserName() + "%' ";
        	}
        }        
        openConn();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
            	User item = new User();
            	item.setUserId(rs.getInt("user_id"));
            	item.setUserName(rs.getString("user_name"));
            	item.setUserPassword(rs.getString("user_password"));
            	item.setUserIdCode(rs.getString("user_id_code"));
            	item.setUserTel(rs.getString("user_tel"));
            	item.setUserAddr(rs.getString("user_addr"));
            	item.setUserZip(rs.getString("user_zip"));
            	item.setUserStatus(rs.getInt("user_status"));
            	list.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeAll();
        return list;
	}


	public User get(Serializable key) {
		// TODO 自动生成方法存根
		return null;
	}

	

}
