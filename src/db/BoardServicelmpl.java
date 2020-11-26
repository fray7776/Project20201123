package db;

import java.util.List;

public class BoardServicelmpl implements BoardService {
	
	BoardDAO dao = new BoardDAO();

	@Override
	public List getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public BoardVO getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public void insertBoard(BoardVO Vo) {
		dao.insertBoard(Vo);
		
	}

	@Override
	public void deleteBoard(int BoardNo) {
		dao.deleteBoard(BoardNo);
		
	}

	@Override
	public void updateBoard(BoardVO boardVo) {
		dao.updateBoard(boardVo);
		
	}

	
	
	

	}


