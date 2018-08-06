package y2ssh.zhangcuishan.dao.jdbcimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class BaseJdbcDAO {
	
	private String dbUser = "sa";
	private String dbPwd = "pwd";
	private String driver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
	private String url = "jdbc:microsoft:sqlserver://localhost:1433;DataBaseName=epai";

    protected Connection conn = null;

    protected Statement stmt = null;

    protected PreparedStatement pstmt = null;

    protected ResultSet rs = null;

    private Connection getConn() {

        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager
                    .getConnection(
                            url,
                            dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    protected void openConn() {
        this.conn = getConn();
    }

    protected void closeAll() {

    	if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
