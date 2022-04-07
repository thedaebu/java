
public class Rapper {
	private String name;
	private String group;
	
	Rapper (String aa, String bb) {
		name = aa;
		group = bb;
	}
	
	Rapper (String aa) {
		name = aa;
		group = "Ruff Ryder";
	}
	
	public String getName() {
		return this.name;
	}
	public String getGroup() {
		return this.group;
	}
}