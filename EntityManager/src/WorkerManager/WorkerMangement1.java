package WorkerManager;

import java.util.Scanner;

import FullTimeEmployee.FullTime;
import FullTimeEmployee.PartTime;
import Service.FullTimeServices;
import Service.PartTimeServices;

public class WorkerMangement1 {

	public static void main(String[] args) {

		int id;
		String name;
		int loc;
		int pn,fn;
		pn=fn=0;
		Scanner sc = new Scanner(System.in);
		
		PartTime pt[]=new PartTime[100];
		FullTime ft[]=new FullTime[100];
		
		FullTimeServices fts=new FullTimeServices();
		PartTimeServices pts=new PartTimeServices();
		
		while(true) {
			System.out.println("1.Create full time worker\n2.Create Part time worker\n3.Search full time by id\n4.Search Part time by id\n5.Search Full time by name\n6.Search Part time by name\n7.max Full time\n8.Max Part time\nEnter your choice: ");
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				ft[fn]=fts.create();
				fn++;
				break;
			case 2:
				pt[pn]=pts.create();
				pn++;
				break;
			case 3:
				System.out.println("Enter a id for Full Time search:");
				id=sc.nextInt();
				loc=fts.search(ft, fn, id);
				
				  if(loc==-1)
					
					System.out.println("NOT FOUND!!");
				else 
					fts.display(ft[loc]);
				
				break;
			case 4:
			
				System.out.println("Enter a id for Part time search:");
				id=sc.nextInt();
				loc=pts.search(pt, fn, id);
				if(loc==-1)
					System.out.println("NOT FOUND!!");
				else
					pts.display(pt[loc]);
				break;
			case 5:
			
				System.out.println("Enter aFull time name for search:");
				name=sc.next();
				loc=fts.searchByName(ft, fn, name);
				if(loc==-1)
					System.out.println("NOT FOUND!!");
				else
					fts.display(ft[loc]);;
				break;
			case 6:
				System.out.println("Enter a Part time name for search:");
				name=sc.next();
				loc=pts.SearchByName(pt, fn, name);;
				if(loc==-1)
					System.out.println("NOT FOUND!!");
				else
					pts.display(pt[loc]);
				break;
			case 7:
				int max = fts.Max(ft, fn);
				for (int i = 0; i < fn; i++) {
					if(max==ft[i].getExtraTime());
					fts.display(ft[i]);
				}
				break;
			case 8:
				int max1 = pts.max(pt, pn);
				for (int i = 0; i < pn; i++) {
					if(max1==pt[i].getNo_of_hr());
					pts.display(pt[i]);
				}
				break;
				
			default:
				System.out.println("INVALID CHOICE:");
				break;
			}
		}
		
	}

}
