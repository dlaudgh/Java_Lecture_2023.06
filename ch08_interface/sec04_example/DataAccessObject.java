package ch08_interface.sec04_example;

public interface DataAccessObject {
	void select();		// 실제로는 DTO type
	void insert();
	void update();
	public abstract void delete();
}
