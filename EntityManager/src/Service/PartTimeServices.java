package Service;

import java.util.Scanner;

import FullTimeEmployee.PartTime;
import container.Address;

public class PartTimeServices {
	public PartTime create()
	{
		Scanner sc = new Scanner(System.in);
		 String name;
		 int age;
		 String mob;
		 Address address;
		 int wid;
		 String deptName;
		 int totalSalary;
		 String buildingName;
		 String street;
		 String area;
		 String landmark;
		 String city;
		 String state;
		 String pincode;
		 int no_of_hr;
	     int rate_per_hr;
	     
	     System.out.println("Enter Worker Name   : ");
		 name = sc.next();
		 System.out.println("Enter Age of worker : ");
		 age = sc.nextInt();
		 System.out.println("Enter Mobile number : ");
		 mob = sc.next();
		 
		 System.out.println("Enter Worker id    : ");
		 wid = sc.nextInt();
		 System.out.println("Enter Worker dept   : ");
		 deptName = sc.next();
		 
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
		 System.out.println(" Enter salary no_of_hr;   : ");
		 no_of_hr = sc.nextInt();
		 System.out.println("Enter extra time :");
		 rate_per_hr = sc.nextInt();
		 
	     PartTime p1 = new PartTime(name, age, mob, ad, wid, deptName, no_of_hr, rate_per_hr);
		 return p1;
	}
	
	public void display(PartTime p1)
	{
		System.out.println("--------------------------Part Time Employee Data------------------------------");
		System.out.println("Name      : " +p1.getName());
		System.out.println("Age       : " +p1.getAge());
		System.out.println("Mobile No : " +p1.getMob());
		System.out.println("---------------------------Part Time Employe as Worker data---------------------");
		System.out.println("Worker Id   : " +p1.getWid());
		System.out.println("Worker Deot : " +p1.getDeptName());
		System.out.println("---------------------------Address----------------------------------------------");
		System.out.println("Building Name : " +p1.getAddress().getBuildingName());
		System.out.println("Street        : " +p1.getAddress().getStreet());
		System.out.println("Area          : " +p1.getAddress().getArea());
		System.out.println("Landmark      : " +p1.getAddress().getLandmark());
		System.out.println("City          : " +p1.getAddress().getCity());
		System.out.println("State         : " +p1.getAddress().getState());
		System.out.println("Pincode       : " +p1.getAddress().getPincode());
		System.out.println("no_of_hr      : " +p1.getNo_of_hr());
		System.out.println("Rate_per_hr   : " +p1.getRate_per_hr());
	}
	public int search(PartTime p1[],int n,int id)
	{
		for(int i=0;i<n;i++)
		{
			if(id == p1[i].getWid())
			{
				return i;
			}
		}
		return -1;
	}
	public int SearchByName(PartTime p1[],int n,String name)
	{
		
		for(int i=0;i<n;i++)
		{
			if(name.equals(p1[i].getName()));
            return i;
		}
		return -1;
	}
   public int max(PartTime p1[],int n)
   {
	   int max = p1[0].getNo_of_hr();
	   for(int i=0;i<n;i++)
	   {
		   if(p1[i].getNo_of_hr()>max)
		   {
			    max = p1[i].getNo_of_hr();
		   }
		   
	   }
	   return max;
	   
   }
}
