package Interface;

public class OracleDao implements DataAccessObject {
//DataAccessObject라는 객체를 구현하는 OracleDao
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
		
	}

	@Override
	public void delete() {
		
		System.out.println("Oracle DB에서 삭제");
	}

}
