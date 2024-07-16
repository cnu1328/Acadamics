package packages;

//Read Only Class
//A Java class which has only getter methods. like College

//Write-Only class
//A Java class which has only setter methods.   

public class Student {
	
	private String name;
	private String College = "RGUKT-BASAR";
	
	public String getCollege() { //Read-only
		return College;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
