package db;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardServicelmpl service = new BoardServicelmpl();
		
		while(true) {
			
			System.out.println("=================================================");
			System.out.println("1.전체 리스트 | 2. 상세화면 | 3. 등록 | 4. 삭제 | 5. 수정");
			System.out.println("=================================================");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();scn.nextLine();
			if(selectNo == 1) {
				List list = service.getBoardList();
				for(Object vo : list) {
					BoardVO bd = (BoardVO)vo;
					bd.showBoardInfo();
					
				}
			}else if(selectNo == 2) {
					System.out.println("검색번호를 입력하시오~~");
					int BoardNo = scn.nextInt();
					BoardVO vo = service.getBoard(BoardNo);
					vo.showBoardInfo();
			}else if(selectNo == 3) {
				System.out.println("게시판 넘버를 입력하시요~");
				int BoardNo= scn.nextInt();scn.nextLine();
				System.out.println("게시판 제목을 입력하시요~");
				String Title = scn.nextLine();
				System.out.println("게시판 내용을 입력하시요~");
				String content = scn.nextLine();
				System.out.println("게시판 작성자를 입력하시요~");
				String writer = scn.nextLine();
				System.out.println("게시판 작성일을 입력하시요~");
				String creation_date = scn.nextLine();
				BoardVO vo = new BoardVO(BoardNo, Title, content, writer, creation_date);
				service.insertBoard(vo);
				
			}else if(selectNo == 4) {
				System.out.println("삭제할 게시판 넘버를 입력하여라~");
				int BoardNo = scn.nextInt();scn.nextLine();
				BoardVO vo = service.getBoard(BoardNo);
				vo.showBoardInfo();
				
				service.deleteBoard(BoardNo);
				
			}else if(selectNo == 5) {
				System.out.println("수정할 넘버를 입력하여라");
				int boardNo = scn.nextInt();scn.nextLine();
				System.out.println("수정할 제목을 입력하여라");
				String boardTitle = scn.nextLine();
				System.out.println("수정할 내용을 입력하여라");
				String boardcontent = scn.nextLine();
				System.out.println("수정한 작성자를 입력하여라");
				String boardwriter = scn.nextLine();
				
				
				BoardVO vo = new BoardVO();
				vo.setBoardNo(boardNo);
				vo.setTitle(boardTitle);
				vo.setContent(boardcontent);
				vo.setWriter(boardwriter);
				
				
				service.updateBoard(vo);
				
				
				}
			}
			
		}
	}
	

