package oops;
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	}
class Employee extends Person{
	private double annualSalary;
	private int yearStarted;
	private String nationalInsuranceNumber;
	public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber ) {
		super(name);
		this.annualSalary=annualSalary;
		this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
	public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    public String toString() {
        return "Name: " + getName() +
               "\nSalary: " + annualSalary +
               "\nYear Started: " + yearStarted +
               "\nNational Insurance Number: " + nationalInsuranceNumber;
    }
		
	}
public class Ques_3 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 55000.0, 2023, "NI987654321");
        System.out.println("--- Employee Details ---");
        System.out.println(emp);
        emp.setName("John D.");
        emp.setAnnualSalary(60000.0);
        System.out.println("\n--- Updated Employee Details ---");
        System.out.println(emp);
    }
}
