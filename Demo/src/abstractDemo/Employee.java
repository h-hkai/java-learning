package abstractDemo;

public abstract class Employee {

	private String name;
	private String Id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	public abstract void work();

}
