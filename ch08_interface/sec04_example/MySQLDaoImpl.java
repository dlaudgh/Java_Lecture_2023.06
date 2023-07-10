package ch08_interface.sec04_example;

public class MySQLDaoImpl implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySQL DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySQL DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySQL DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB에서 삭제");
	}
	
}
