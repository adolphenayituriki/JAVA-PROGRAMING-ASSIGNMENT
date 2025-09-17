package assignment.billCulculate;

import java.util.Scanner;

public class BillsCulcutate {

	public static void main(String[] args) {
	     System.out.println("===BILLS CULCUTATE===");
	     System.out.println("Suppermarket Items");
	     System.out.println("a) Banana b) Mango c) Shoes d) Rice e) Beans \n");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter an item name: ");
	     String item = sc.next();
	     System.out.println("Enter price per unit: ");
	     double price = sc.nextDouble();
	     System.out.println("Enter quantinty purchased: ");
	     int quantity = sc.nextInt();
	     System.out.println("Enter the names of customer: ");
	     String customer = sc.next();
	     
	     
	     
	     //RECEIPT
	     System.out.println("=====RECEIPT=======");
	   //calculating prices
	     double priceCal = quantity*price;
	     double TotalPrice = priceCal;
	     double FinalAmmount = 0;
	     double Discount =0;
	     if(priceCal>50000){
	    	 Discount = TotalPrice*(5)*100;
	    	 FinalAmmount = priceCal-TotalPrice*(5)/100;
	    	 System.out.println("| Dear "+customer + " Discount allowed to you !!");
	    	 System.out.println("|  Item: "+item);
	    	 System.out.println("| Quantiry purchased: "+quantity+ "Kg");
	    	 System.out.println("| Price per Unity: "+price + "Rfw");
	    	 System.out.println("| Sub totals: "+priceCal + "Rfw" );
	    	 System.out.println("| Grand total before discount: "+priceCal + "Rfw");
	    	 System.out.println("| Discount "+Discount + "Rfw");
	    	 System.out.println("| Final ammount payable: "+FinalAmmount + "Rfw");
	    	 System.out.println("| ----------------------------");
	    	 System.out.println("| Customer Name: "+ customer);
	    	 System.out.println("| Supermarket Billing System Signature|| xxx");
	    	 
	    	 
	    	 
	     }
	     else {
	    	 System.out.println("| NO DISCOUNT FOR YOU! ");
	    	 System.out.println("| Item: "+item);
	    	 System.out.println("| Quantiry purchased: "+quantity +"Kg");
	    	 System.out.println("| Price per Unity: "+price+ "Rfw");
	    	 System.out.println("| Sub totals: "+priceCal );
	    	 System.out.println("| Grand total before discount: "+priceCal+ "Rfw");
	    	 System.out.println("| Discount: 0 ");
	    	 System.out.println("| Final ammount payable: "+priceCal + "Rfw");
	    	 System.out.println("| ----------------------------");
	    	 System.out.println("| Customer Name: "+ customer);
	    	 System.out.println("| Supermarket Billing System Signature|| xxx");
	     }
	     
	    

	}

}

