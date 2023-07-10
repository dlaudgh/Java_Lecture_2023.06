package challenge;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable {
	private int id;
	private String name;
	private Position position;
	private LocalDate joinDate;
	public Employee() { }
	public Employee(int id, String name, Position position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee emp = (Employee) obj;
		return id == emp.getId() && name.equals(emp.getName());
	}
	@Override
	public int compareTo(Object obj) {
		Employee emp = (Employee) obj;
		if (position.equals(emp.getPosition()))
			return joinDate.compareTo(emp.getJoinDate());
		return position.compareTo(emp.getPosition());
	}
	
}
