package db;

import java.util.List;

public interface BoardService {
	public List getBoardList(); //리스트 조회
	public BoardVO getBoard(int boardNo);//상세화면 조회
	public void insertBoard(BoardVO boardVo);//등록
	public void deleteBoard(int boardNo);//삭제
	public void updateBoard(BoardVO boardVo);

}
