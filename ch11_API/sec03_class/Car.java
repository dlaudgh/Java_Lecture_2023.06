package ch11_API.sec03_class;

public class Car {
	private String model;
	private String manufacturer;
	
	public Car() { }
	public Car(String model, String manufacturer) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", manufacturer=" + manufacturer + "]";
	}
	
}
