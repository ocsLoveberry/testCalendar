package main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javaBeans.JikanwariTable;

public class JikanwarTableiDAO extends DAOBase implements DAOinterface {

	@Override
	public ArrayList<JikanwariTable> selectAll() {
			ArrayList<JikanwariTable> jikanwari;
			jikanwari = new ArrayList<>();
			final String sql = "SELECT * FROM JIKANWARI_TBL";
			ResultSet rs = null;

			try {
				this.open();
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					String class_cd = rs.getString("class_cd");
					String start_date = rs.getString("start_date");
					String start_time_cd = rs.getString("start_time_cd");
					String tokutei_cd = rs.getString("tokutei_cd");
					jikanwari.add(new JikanwariTable(class_cd,start_date,start_time_cd,tokutei_cd));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		return jikanwari;
	}

	@Override
	public ArrayList<?> selectWhere(String where) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean deleteWhere(String where) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean insert() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}




}
