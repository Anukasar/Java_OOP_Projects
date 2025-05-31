import java.util.Scanner;

public class BankAccountMain  {
     
	public static void openaccount(int accno,String custname,int accbal,int age) throws Balancevalidation , AgeValidation{
		try {
			if(accbal<2000)
			{
				throw new Balancevalidation();
			}
			if(age<18)
			{
				throw new AgeValidation();
			}
		}catch(Balancevalidation bv) {
			System.out.println("Exception is " +bv);
			throw bv;
		}
		catch(AgeValidation av) {
			System.out.println("Exception is " +av);
			throw av;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer name   :");
	    String name = sc.next();
	    System.out.println("Enter Account number  :");
	    int accno = sc.nextInt();
	    System.out.println("Enter Account balance :");
	    int accbal = sc.nextInt();
	    System.out.println("Enter age of customer : ");
	    int age = sc.nextInt();
	    try {
	    	openaccount(accno,name,accbal,age);
	    	System.out.println("Your account is created");
	    }catch(Balancevalidation b) {
	    	b.printStackTrace();
	    }catch(AgeValidation e) {
	    	
	    	e.printStackTrace();
	    }
	    
	    System.out.println("Thank for visiting.........");
	}
 
	
}
