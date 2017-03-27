package http_client_in_core_java;

public class Student implements Comparable<Student> {
	String firstName;
	String lastName;
	
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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




	@Override
	public int compareTo(Student s){
		if(this.lastName.compareTo(s.lastName) != 0)
			return this.lastName.compareTo(s.lastName);
		return this.firstName.compareTo(s.firstName);
		
	}


	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	

}
