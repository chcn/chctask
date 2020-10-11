package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tools.DBUtil;
import vo.DownloadList;

public class DownloadListDao {
	public static List<DownloadList> queryAllList() {

		ResultSet rs = null;
		String sql = "select * from t_downloadlist";
		Object[] params = null;
		List<DownloadList> list = new ArrayList<>();
		rs = DBUtil.executeQuery(sql, params);
		try {
			while(rs.next()){
				DownloadList load = new DownloadList();//user����Ҫд��whileѭ���ڣ���Ȼuser�ڵ����ݻᱻ���һ�������滻
				load.setId(rs.getInt("id"));
				load.setName(rs.getString("name"));
				load.setPath(rs.getString("path"));
				load.setDescription(rs.getString("description"));
				load.setSize(rs.getDouble("size"));
				load.setStar(rs.getInt("star"));
				load.setImage(rs.getString("image"));
				list.add(load);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(DBUtil.co, DBUtil.ps, rs);
		}
		return list;
	}
	
	public static DownloadList queryAllList1() {

		ResultSet rs = null;
		String sql = "select * from t_downloadlist";
		Object[] params = null;
		rs = DBUtil.executeQuery(sql, params);
		DownloadList load = new DownloadList();
		try {
			while(rs.next()){
				//user����Ҫд��whileѭ���ڣ���Ȼuser�ڵ����ݻᱻ���һ�������滻
				load.setId(rs.getInt("id"));
				load.setName(rs.getString("name"));
				load.setPath(rs.getString("path"));
				load.setDescription(rs.getString("description"));
				load.setSize(rs.getDouble("size"));
				load.setStar(rs.getInt("star"));
				load.setImage(rs.getString("image"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(DBUtil.co, DBUtil.ps, rs);
		}
		return load;
	}
}
///META-INF/img/gaokao.jpg
///META-INF/�߿�����.zip
