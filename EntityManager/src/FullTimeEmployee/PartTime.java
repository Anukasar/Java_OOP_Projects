package FullTimeEmployee;

import Worker_SuperClass.worker;
import container.Address;

public class PartTime extends worker{
	private int no_of_hr;
	private int rate_per_hr;

	public PartTime(String name, int age, String mob, Address address, int wid, String deptName,
			int no_of_hr, int rate_per_hr) {
		super(name, age, mob, address, wid, deptName);
		this.no_of_hr = no_of_hr;
		this.rate_per_hr = rate_per_hr;
		super.setTotalSalary(no_of_hr*rate_per_hr);
	}
	public int getNo_of_hr() {
		return no_of_hr;
	}
	public void setNo_of_hr(int no_of_hr) {
		this.no_of_hr = no_of_hr;
		super.setTotalSalary(no_of_hr*rate_per_hr);
	}
	public int getRate_per_hr() {
		return rate_per_hr;
	}
	public void setRate_per_hr(int rate_per_hr) {
		this.rate_per_hr = rate_per_hr;
		super.setTotalSalary(no_of_hr*rate_per_hr);
	}



}
