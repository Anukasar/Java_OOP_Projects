package Main;
import java.util.*;

import Worker_SuperClass.worker;
import sub_class.Manager;
import container.Address;
public class TestManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,mobno,dept,street,buildingName,area,landmark,pincode;
		String city,state;
		int age,id;
		float salary,tax,da,hra,totalsalary;
		Address address;
		System.out.println("Enter How many person you want : ");
		int n = sc.nextInt();
		Manager m1[] = new Manager[n];
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println("----------------------Person-----------------------");
		       System.out.println("Enter Name : ");
		       name = sc.next();
		       System.out.println("Enter age  : ");
		       age = sc.nextInt();
		       System.out.println("Enter Mobile No : ");
		       mobno = sc.next();  
		       System.out.println("-----------------------Address--------------------");
		       System.out.println("building name  : ");
		       buildingName = sc.next();
		       System.out.println("Street         : ");
		       street = sc.next();
		       System.out.println("Area        : ");
		       area = sc.next();
		       System.out.println("Landmark   : ");
		       landmark = sc.next();   
		       System.out.println("City       : ");
		       city = sc.next();
		       System.out.println("State      :  ");
		       state = sc.next();
		       System.out.println("Pincode    : ");
		       pincode = sc.next();
		       Address ad = new Address(buildingName,street,area,landmark,city,state,pincode);
		       System.out.println("---------------Employee Data--------------------");
		       System.out.println("Enter Id     : " );
		        id = sc.nextInt();
		        System.out.println("Enter Dept   : ");
		        dept = sc.next();
		        System.out.println("Enter salary :");
		        salary = sc.nextInt();
		       System.out.println("--------------------------Manager Data---------------------------");
		       System.out.println("Enter Dearness Allownance     : ");
		       da = sc.nextFloat();
		       System.out.println("Enter the tax  :  ");
		       tax = sc.nextFloat();
		       System.out.println("Enter the hra  :  ");
		       hra = sc.nextFloat();
		       totalsalary = salary +(salary*(hra+da-tax)/100);
		       
		        System.out.println("-----------------------Enter Worker Details--------------------------");
		        System.out.println("Enter Worker Id   : ");
		        int wid = sc.nextInt();
		        System.out.println("Enter Worker Dept : ");
		        String wname = sc.next();
		        worker w = new worker(wname, wid,wname, ad, wid, wname);
		        m1[i] = new Manager(name, age, mobno,ad,id,dept,salary,da,tax,hra,totalsalary,w);
		        
		        
	    	 
	     }
	     for(int i=0;i<n;i++)
	     {
	    	  System.out.println("***********************************Given data*************************************");
	          System.out.println("------------------------Person details---------");
	          System.out.println("Name        :  " +m1[i].getName());
	          System.out.println("Age         :  " +m1[i].getAge());
	          System.out.println("Mobile No   :  " +m1[i].getMob());
	          System.out.println("----------------------Employee Details------------");
	          System.out.println("Employee Id     : " +m1[i].getId());
	          System.out.println("Employee name   : " +m1[i].getDept());
	          System.out.println("Employee salary : " +m1[i].getSalary());
	          System.out.println("----------------------Manager Data----------------------");
	          System.out.println("Dearness Allownance  : " +m1[i].getDa());
	          System.out.println("Tax                  : " +m1[i].getTax());
	          System.out.println("Home rent Allownance : " +m1[i].getHra());
	          System.out.println("----------------------ADDRESS--------------------------");
	          System.out.println("Building Name    : " +m1[i].getAddress().getBuildingName());
	          System.out.println("Street           : " +m1[i].getAddress().getStreet());
	          System.out.println("Area             : " +m1[i].getAddress().getArea());
	          System.out.println("Landmark         : " +m1[i].getAddress().getLandmark());
	          System.out.println("City             : " +m1[i].getAddress().getCity());
	          System.out.println("State            : " +m1[i].getAddress().getState());
	          System.out.println("Pincode          : " +m1[i].getAddress().getPincode());
	          System.out.println("Total salry      : " +m1[i].getTotalsalary());
	         
	    	 
	    	 
	     }
	    	
	       
	}
	    	 
	 
       
}


