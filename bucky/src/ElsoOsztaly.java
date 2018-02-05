public class ElsoOsztaly {
	private String girlName;
	public void setName(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Az első csajod %s volt.", getName());
	}
}
