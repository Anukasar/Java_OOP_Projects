package Service;

import java.util.Scanner;

import FullTimeEmployee.FullTime;
import container.Address;

public class FullTimeServices {
	
	 
	 public FullTime create()
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
		 int salary;
	     int extraTime;
	     int rph;
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
         
		 System.out.println(" Enter salary    : ");
		 salary = sc.nextInt();
		 System.out.println("Enter extra time :");
		 extraTime = sc.nextInt();
		 if(extraTime!=0)
         {
        	 System.out.println("Enter rate per hour");
         }
		 rph = sc.nextInt();
		 
		 Address ad = new Address(buildingName,street,area,landmark,city,state,pincode);
		 FullTime f1 = new FullTime(name,age,mob,ad,wid,deptName,salary,extraTime,rph);
		 return f1;
		 
	 }

	 public void display(FullTime f1)
	 {
		 System.out.println("Total Salary      : " +f1.getTotalSalary());
		 System.out.println("----------------------worker as person------------------");
		 System.out.println("Worker Name       :  " +f1.getName());
		 System.out.println("Worker age        :  " +f1.getAge());
		 System.out.println("Worker Mobile No. :  " +f1.getMob());
		 System.out.println("Worker Id         :  " +f1.getWid());
		 System.out.println("Worker Department :  " +f1.getDeptName());
		 System.out.println("-----------------------Worker Address-------------------");
		 System.out.println("building Name     : " +f1.getAddress().getBuildingName());
		 System.out.println("street Name       : " +f1.getAddress().getStreet());
		 System.out.println("Area Name         : " +f1.getAddress().getArea());
		 System.out.println("LandMark          : " +f1.getAddress().getLandmark());
		 System.out.println("City              : " +f1.getAddress().getCity());
		 System.out.println("Pincode           : " +f1.getAddress().getPincode());
		 System.out.println("Salary            : " +f1.getSalary());
		 System.out.println("Extra Time        : " +f1.getExtraTime());
		 System.out.println("Rate per hour     : " +f1.getRph());
	 }
	 //search by id
	 public int search(FullTime f1[],int id,int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 if(id == f1[i].getWid())
			 {
				 return i;
			 }
		 }
		return -1;
		 
	 }
	 public int searchByName(FullTime f1[],int n,String name)
	 {
		for(int i=0;i<n;i++)
		{
			if(name.equals(f1[i].getName()));
            return i;
		}
		return -1;
	 }
	 public int Max(FullTime f1[],int n)
	 {
		 int max = f1[0].getExtraTime();
		 for(int i=0;i<n;i++)
		 {
			 if(f1[i].getExtraTime()>max)
			 {
				 max = f1[i].getExtraTime();
			 }
	     }
		 return max;
	 }
}
