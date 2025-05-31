package clgManager;

import java.util.Scanner;

import HOD_SubClass.Hod;
import Hod_Services.HodServices;

public class TestHod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 HodServices hs = new HodServices();
	        System.out.println("Enter how many persons or teachers you want : ");
	        int n = sc.nextInt();
	        Hod h1[] = new Hod[n];
	        int ch1;

	        do {
	            System.out.println("1-create\n2-display\n3-search\n4Increment\n5-Exit");
	            System.out.println("Enter your choice");
	            ch1 = sc.nextInt();
	            
	            switch (ch1) {
	                case 1:
	                    hs.create(h1, n);
	                    break;
	                case 2:
	                    hs.display(h1, n);
	                    break;
	                case 3:
	                    System.out.println("Enter any name, department, or city to search for the person: ");
	                    String data = sc.next();
	                    int index = hs.search(h1, n, data);
	                    if (index != -1) {
	                        System.out.println("Teacher found at index: " + index);
	                        hs.display(new Hod[] { h1[index] }, 1);
	                    } else {
	                        System.out.println("Teacher not found.");
	                    }
	                    break;
	                case 4:
	                    hs.increment(h1);
	                    break;
	                case 5:
	                	 hs.calculateAndDisplayTotalSalary(h1, n);
	                    break;
	                default:
	                    System.out.println("Invalid choice, please try again.");
	                    break;
	            }
	        } while (ch1 != 5);
	        
	        sc.close();
	    }

}
