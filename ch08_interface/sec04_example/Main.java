package ch08_interface.sec04_example;

public class Main {

	public static void main(String[] args) {
		dbWork(new MySQLDaoImpl());
		dbWork(new OracleDaoImpl());
	}

	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
}
