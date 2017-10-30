package hashtables;

public class FullTimeEmployee extends EmployeeInfo {
	
	private double yearlySalary;

	public FullTimeEmployee(int employeeNumber) {
		super(employeeNumber);
		// TODO Auto-generated constructor stub
	}

	
	public double calcAnnualGrossIncome(){
		return this.yearlySalary;
	}
	
	public double AnnualNetIncome(){
		return calcAnnualGrossIncome()*(1-deductRate);
	}
}
