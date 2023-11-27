package modelAPI;

import java.util.ArrayList;
import java.util.List;

import utilities.DataHelper;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String programme;
	private List<String> courses;
	
	private Student() {
		this.id = 100;
		DataHelper datahelper = DataHelper.getDataHelper();
		this.firstName = datahelper.getFirstName();
		this.lastName = datahelper.getLastName();
		this.email = datahelper.getEmailAddress();
		this.programme = "Computer Science";
		List<String> courses = new ArrayList<>();
		courses.add(datahelper.getCourse());
		courses.add(datahelper.getCourse());
		this.courses = courses;
	}
	
	public static Student getInstance(){
        return new Student();
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	
}
