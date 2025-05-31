import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int accno;
		int accbal;
		int age;
		
		System.out.println("Enter Name            : ");
		name = sc.next();
		System.out.println("Enter Account Number  : ");
		accno = sc.nextInt();
		System.out.println("Enter account balance : ");
		accbal = sc.nextInt();
		System.out.println("Enter age              : ");
		age = sc.nextInt();
		try {
			if(accbal<2000)
			{
				throw new Balancevalidation();	
			}
			System.out.println("Your account is created");
			
			if(age<20)
			{
				throw new AgeValidation();
			}
			System.out.println("Your profile is created");
			
		}
		catch(Balancevalidation bv) {
			System.out.println("Excepion is " +bv);
		}
		catch(AgeValidation av) {
			System.out.println("Exception is " +av);
		}
		
	}

}
