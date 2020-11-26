package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;


public class BoardDAO {
	Connection conn = DAO.getConnection();
	PreparedStatement pstm;
	ResultSet rs;
	String sql;

	// 전체리스트
	public List getBoardList() {
		
		sql = "select * from board";
		List list = new ArrayList();
		try {
			pstm = conn.prepareStatement(sql);
			rs= pstm.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardNo(rs.getInt("board_No"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("Content"));
				vo.setWriter(rs.getString("Writer"));
				vo.setCreationDate(rs.getString("Creation_Date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}
		
	


	// 상세화면
	public BoardVO getBoard(int boardNo) {
		sql = "select * from board where board_no=?";
		BoardVO vo = new BoardVO();
		try {
			pstm= conn.prepareStatement(sql);
			pstm.setInt(1, boardNo);
			rs = pstm.executeQuery();
			if(rs.next()) {
				vo.setBoardNo(rs.getInt("board_No"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("Content"));
				vo.setWriter(rs.getString("Writer"));
				vo.setCreationDate(rs.getString("Creation_Date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
		
	}
	//등록
	public void insertBoard(BoardVO vo) {
		sql = "insert into board(board_no, title, content, writer, creation_date)"+"values(?,?,?,?,?)";
		
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, vo.getBoardNo());
			pstm.setString(2, vo.getTitle());
			pstm.setString(3, vo.getContent());
			pstm.setString(4, vo.getWriter());
			pstm.setString(5, vo.getCreationDate());
			int r = pstm.executeUpdate();
			System.out.println(r+"건이 작성되었다~~");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//삭제
	public void deleteBoard(int BoardNo) {
		sql = "delete from board where board_no = ?";
		try {
			pstm=conn.prepareStatement(sql);
			pstm.setInt(1, BoardNo);
			
			int r = pstm.executeUpdate();
			System.out.println(r+"건이 삭제되었음!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//수정
	
	public void updateBoard(BoardVO vo) {
		if(vo.getBoardNo() !=0) {
			sql = "update board" + " set title='"+vo.getTitle()+"',"+"content='"+vo.getContent()+"',"+"writer='"+vo.getWriter()+"',"+"creation_Date=sysdate"
				  +" Where board_no ="+vo.getBoardNo(); 
		}
		try {
			pstm = conn.prepareStatement(sql);
			int r = pstm.executeUpdate();
			System.out.println(r+ "건이 수정됨");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
