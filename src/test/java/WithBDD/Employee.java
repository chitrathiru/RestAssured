package WithBDD;

import java.util.List;

public class Employee {
	
	private String First_name;
	private String Last_name;
	private String Email;
	private List Skills;
	
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List getSkills() {
		return Skills;
	}
	public void setSkills(List skills) {
		Skills = skills;
	}

}
