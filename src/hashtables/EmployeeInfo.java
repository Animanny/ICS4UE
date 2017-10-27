package hashtables;

public class EmployeeInfo {
	private String firstName;
	private String lastName;
	private int empNumber;
	private Gender gender;
	private Location location;
	private double deductRate;
	
	public EmployeeInfo(int employeeNumber){
		this.empNumber = employeeNumber;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public double getDeductRate() {
		return deductRate;
	}
	public void setDeductRate(double deductRate) {
		this.deductRate = deductRate;
	}
	
	
	
}
