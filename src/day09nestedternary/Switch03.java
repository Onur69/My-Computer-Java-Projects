package day09nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		/*
		 kullanicidan ay numarasini alin
		 ay numarasi girilince o ay ve sonra ki tum aylarin isimlerei ekrana yazilsin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("ay numarasi giriniz");
		int ay=scan.nextInt();
		
		switch(ay) {
		
		case 1:
		    System.out.println("ocak");
		
		case 2:
	        System.out.println("subat");
	    
		case 3:
			System.out.println("mart");
			
		case 4:
		    System.out.println("nisan");
		   
		case 5:
			System.out.println("mayis");
				
		case 6:
		    System.out.println("haziran");
			   
		case 7:
			System.out.println("temmuz");
					
		case 8:
		    System.out.println("agustos");
				   
		case 9:
			System.out.println("eylul");
						
		case 10:
		    System.out.println("ekim");
					
		case 11:
			System.out.println("kasim");
						
		case 12:
		    System.out.println("aralik");
		    break;
		
		default:
			System.out.println("gecersiz ay sayisi");
					    
		}
		scan.close();
	}

}
