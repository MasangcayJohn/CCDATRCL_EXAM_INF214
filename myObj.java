import java.util.Scanner;  

class myObj {
  public static void main(String[] args) {

     Scanner myObj = new Scanner(System.in);

      System.out.println("Enter surnaname:");

	   String  sur = myObj.nextLine();

       System.out.println("Enter code:");

       String code = myObj.nextLine(); 
    
       System.out.println("current stack: " + sur + " "+code);  // Output user input
    
       System.out.println(" enter 1 to update the stack or 0 to exit:");

       int opt  = myObj.nextInt(); 
       
      if(opt == 0){

      	System.out.println("The program is finished!");

      	}else{
 
      		System.out.println("Enter 3 to update the surname , 2 to update the code or 0 to exit:");

      		 int opt2  = myObj.nextInt(); 

      		 Scanner myObj2 = new Scanner(System.in);

      		 if(opt2 == 3){		 
      		 
      		 	System.out.println("Change surname: "+sur +" to:" );

      		    String suru = myObj2.nextLine(); 

      		  	System.out.println("The Stack is succesfully updated");
            
      		 	System.out.println("current stack: " + suru + " "+code);			
      		 					
      		 	}else if(opt2== 2){

      		 		System.out.println("Change the code: "+code +" to:" );

      		 		String codeu = myObj2.nextLine();

      		 		System.out.println("The Stack is succesfully updated");

      		 	    System.out.println("current stack: " + sur + " "+codeu);			
      		 				
      		 		}else{

      		 			System.out.println("The program is finished!");

      		 			}
      		 			
      		 			
      		 				
      		}
      
    
    
  }
}
