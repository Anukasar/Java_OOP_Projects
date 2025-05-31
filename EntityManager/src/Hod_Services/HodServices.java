package Hod_Services;

import java.util.Scanner;

import HOD_SubClass.Hod;
import container.Address;

public class HodServices {
	Scanner sc = new Scanner(System.in);
	public void create(Hod h[],int n)
	{
		String name;
		int age;
		String mob;
		int id;
		String sub;
		float salary;
		String dept;
		int hra;
		int da;
		int tax;
		String buildingName;
		String street;
		String area;
		String landmark;
		String city;
		String state;
		String pincode;
		int exp;
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name of Teacher   : ");
			name = sc.next();
			System.out.println("Enter the Age of tecaher     : ");
			age = sc.nextInt();
			System.out.println("Enter the mobile number      : ");
			mob = sc.next();
			System.out.println("Enter id of teacher          :  ");
			id = sc.nextInt();
			System.out.println("Enter the subject of teacher : ");
			sub = sc.next();
			System.out.println("Enter salary of teacher      : ");
			salary = sc.nextFloat();
			System.out.println("Enter department             : ");
			dept = sc.next();
			System.out.println("Enter home rent allowancw    : ");
			hra = sc.nextInt();
			System.out.println("Enter dearness allowance     : ");
			da = sc.nextInt();
			System.out.println("Enter tax                    : ");
			tax = sc.nextInt();
			System.out.println("Enter the Experience         : ");
			exp = sc.nextInt();
			System.out.println("Enter building Name : ");
			buildingName = sc.next();
			System.out.println("Enter Street name    : ");
			street = sc.next();
			System.out.println("Enter area          : ");
			area = sc.next();
			System.out.println("Enter landmark      : ");
			landmark = sc.next();
			System.out.println("city    : ");
			city = sc.next();
			System.out.println("Enter State : ");
			state = sc.next();
			System.out.println("enter pincode : ");
			pincode = sc.next();
			Address ad = new Address(buildingName,street,area,landmark,city,state,pincode);
			h[i] =  new Hod(name,age,mob,ad,id,sub,salary,dept,hra,da,tax,exp);

		}
		

	}
	public void display(Hod h1[], int n) {
        if (h1 == null || h1.length == 0) {
            System.out.println("No teachers created yet.");
            return;
        }
        for (int i = 0; i < h1.length; i++) {
            if (h1[i] != null) {  
                System.out.println("Name of Teacher  : " + h1[i].getName());
                System.out.println("Age              : " + h1[i].getAge());
                System.out.println("Mobile Number    : " + h1[i].getMob());
                System.out.println("--------------------------------------------------");
                System.out.println("Id               : " + h1[i].getId());
                System.out.println("Subject          : " + h1[i].getSub());
                System.out.println("Salary           : " + h1[i].getSalary());
                System.out.println("Department       : " + h1[i].getDept1());
                System.out.println("---------------------------------------------------");
                System.out.println("Hra              : " + h1[i].getHra());
                System.out.println("Tax              : " + h1[i].getTax());
                System.out.println("Da               : " + h1[i].getDa());
                System.out.println("Experience       : " + h1[i].getExp());
                System.out.println("Total Salary     : " + h1[i].getTotalsalary());
                System.out.println("--------------------Address------------------------");
                System.out.println("Building Name    : " + h1[i].getAddress().getBuildingName());
                System.out.println("Street Name      : " + h1[i].getAddress().getStreet());
                System.out.println("Area Name        : " + h1[i].getAddress().getArea());
                System.out.println("Landmark         : " + h1[i].getAddress().getLandmark());
                System.out.println("City             : " + h1[i].getAddress().getCity());
                System.out.println("Pincode          : " + h1[i].getAddress().getPincode());
            }
        }
    }

	public int search(Hod h1[],int n,String data)
	{
		for(int i=0;i<n;i++)
		{
		   if(h1[i].getName().equals(data)||h1[i].getDept1().equals(data)||h1[i].getAddress().getCity().equals(data))
		   {
			   return i;
		   }
		}
		return -1;
	}

	
	public void increment(Hod h1[])
	{
		for(int i=0;i<h1.length;i++)
		{
			if(h1[i].getExp()>=10)
			{
				float incrementSalary = h1[i].getSalary()+(h1[i].getSalary()*0.10f);
				h1[i].setSalary(incrementSalary);
				System.out.println("Salary is inremented by 10% for" +h1[i].getName());
			}
			else
			{
				System.out.println("Salary is not incremented as experience in less than 10%");
			}
		}
	}
	
	
	 public double calculateTotalSalary(Hod h) {
	        double hraAmount = (h.getHra() / 100.0) * h.getSalary();
	        double daAmount = (h.getDa() / 100.0) * h.getSalary();
	        double taxAmount = (h.getTax() / 100.0) * (h.getSalary() + hraAmount + daAmount);
	        
	        double increment = 0;
	        if (h.getExp() >= 10) {
	            increment = 0.10 * h.getSalary();
	        }

	        double totalSalary = h.getSalary() + hraAmount + daAmount - taxAmount + increment;
	        h.setTotalsalary(totalSalary);
	        return totalSalary;
	    }

	    public void calculateAndDisplayTotalSalary(Hod h1[], int n) {
	        for (int i = 0; i < n; i++) {
	            double totalSalary = calculateTotalSalary(h1[i]);
	            System.out.println("Total Salary for " + h1[i].getName() + " (ID: " + h1[i].getId() + ") is: " + totalSalary);
	        }
	    }
   
}
    
