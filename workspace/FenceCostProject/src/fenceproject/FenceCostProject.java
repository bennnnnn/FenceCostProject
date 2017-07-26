package fenceproject;

import java.util.Scanner;

public class FenceCostProject {
	
	 

	public static void main(String args[]){
		
		 
		 double fenceWidth; // holds fence's length
		 double fenceLength; // fence's width
		 double fencePerimeter; // holds fence perimeter      
	     int numberOfGates;            // holds number of gates needed.
	     double totalGateCost;          // holds total cost of gates
		 double totalFenceCost;         //holds total fence cost
		 double onlyFenceCost =0;     // holds only fence cost
		 double fenceTax; // holds fence tax
		 final int eachGateCost =150;  // holds cost for each gate
		 final int woodenFenceCostPerFoot= 25;  // cost of wooden fence per foot
		 final  int chainLinkFenceCostPerFoot =15;        // cost of chain-link fence per foot
		 final double PERMITFEE =50.0; // Building permit fee
		 final double TAXRATE =0.06; // holds fence tax rate
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Enter the width of the fence:"); //  prompt user to enter width
		
		fenceWidth =scan.nextDouble();  // Read  fence Width
		
        System.out.println( "Enter the length of the fence:"); // prompt user to enter length
		
		fenceLength =scan.nextDouble(); // Read fence length
		
		fencePerimeter= 2*(fenceWidth +fenceLength);   // calculate perimeter of the fence
		
		System.out.println( "What kind of fence do you want?  Choose 1 for wooden and 2 for chain link foot.\n1.  Wooden fence\n2. chain link foot");
		 int fenceType=scan.nextInt();
		 
		 switch(fenceType){             // choose fence type
		  
		 case 1:
		   onlyFenceCost = woodenFenceCostPerFoot * fencePerimeter;  // fence cost for wooden fence 
		 break;
		 case 2:
			 onlyFenceCost =chainLinkFenceCostPerFoot*fencePerimeter;  // fence cost for chain-link fence
		 }
		      
		 
		System.out.println( "Number of gates needed:"); // prompt user to enter number of gates
		 numberOfGates=scan.nextInt();  // read number of gates
		 
		 totalGateCost=numberOfGates*eachGateCost; // calculate total cost of gates
		 
		 fenceTax= (onlyFenceCost + totalGateCost)*TAXRATE; // calculate fence  tax 
		 
		 totalFenceCost=onlyFenceCost + totalGateCost + PERMITFEE + fenceTax; // calculate total fence cost. fence cost + gate cost + permit
		 
		 
		 System.out.println( "\t\tFence width :  \t\t"+fenceWidth);
		 System.out.println( "\t\tFence length:   \t"+fenceLength);
		 System.out.println( "\t\tFence Perimeter: \t"+fencePerimeter);
		 System.out.println( "\t\tNumber of gates needed:\t "+numberOfGates);
		 System.out.println( "\t\tOnly fence cost: \t"+onlyFenceCost);
		 
		 System.out.println( "\t\tGate cost: \t\t"+totalGateCost);
		 System.out.println("\t\tFence tax: \t\t"+fenceTax);
		 System.out.println( "\t\tTotal cost of the fence: "+totalFenceCost);
		 
		 
	}
}