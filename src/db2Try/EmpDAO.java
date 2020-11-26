package db2Try;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.DAO;

public class EmpDAO {
	Connection conn = DAO.getConnection();
	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	

}
