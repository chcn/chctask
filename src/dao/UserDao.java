package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import vo.User;
import tools.DBUtil;

public class UserDao {
	public static boolean queryUser(User user) {

		ResultSet rs = null;
		String sql = "select password from t_user where userName= ?";
		Object[] params = {user.getUname()};
		System.out.println("userName:"+user.getUname());
		rs = DBUtil.executeQuery(sql, params);
		try {
			if(rs.next()) {
				String pwd = rs.getString(1);
				System.out.println("daoPwd:"+pwd);
				if(pwd.equals(user.getUpwd())) {
					return true;
				}else {
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeAll(DBUtil.co, DBUtil.ps, rs);
		}
		return false;
	}
	
	public static boolean QueryUserByName(String name){
		ResultSet rs = null;
		String sql = "select password from t_user where userName=?";
		Object[] params ={name};
		rs=DBUtil.executeQuery(sql, params);
		User user = new User();
		try {
			if(rs.next()){
				String pwd = rs.getString(1);
				System.out.println("daoPwd:"+pwd);
				if(pwd.equals(user.getUpwd())) {
					return true;
				}else {
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeAll(DBUtil.co, DBUtil.ps, rs);
		}
		return false;
	}
}
