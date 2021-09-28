class Loops 
{
	public static void main(String args[])
	{
	    for (int product = 1; product <=10; product=product+=1)
		{
		    System.out.println(product); //7*1 
		}
		

		// entry controlled loop
		int i = 5;
		while(i< 11)
		{
			System.out.println(i);
			i= i+1;
		}
	
		
		int j = 20;
		do 
		{
			System.out.println(j); //20
			j= j+1; //21
		} while(j< 11); 

		// exit controlled loop
		
		
	}
}

/*
 * Syntax of for loop:
 *  * for (initialisation/assignment ;  condition;  updation ){
 * 
 * 		// write the code that has to be repeated
 * }
 * 
 * 
   Syntax of While loop:
   
 * initialize the variable
 * while (condition){
 * 
 *   updation;
 * }
 * 
 * 
 * 
    Syntax of do while loop:
    
 *  initialize the variable
 *  do {
 *  
 *   // write all code
 *   // updation logic
 *  } while (i< 10)
 * 
 * 
 * 
*/

