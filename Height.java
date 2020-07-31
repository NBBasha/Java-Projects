import java.util.*;


class Height
{

   private int feet;
	
   private int inches;
	
	
      public void getDistance()
{
		
          Scanner sc=new Scanner(System.in);
		

           System.out.print("Enter feet: ");
	
       	   feet=sc.nextInt();

	   System.out.print("Enter inches: ");
	
       	   inches=sc.nextInt();
        	} 
      public void showDistance()
{

	System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	
}
	

	public void addDistance(Height H1, Height H2)
	{

		inches=H1.inches+H2.inches;
	
	feet=H1.feet+H2.feet+(inches/12);
	
	inches=inches%12;

	}

}


 class Main
{

	public static void main(String []s)
	{
	
	try
{

			
                Height H1=new Height();
	
		Height H2=new Height();
	
		Height H3=new Height();
		
	
	//read first Height
	
	System.out.println("Enter first Height: ");
		
	        H1.getDistance();
			

		//read second Height
	
        System.out.println("Enter second Height: ");
		
	        H2.getDistance();
			

		//add heights 
		
	        H3.addDistance(H1,H2);
		
	        //print Height
		
	System.out.println("Total Height is:" );
	
		H3.showDistance();
	
	}
	
	catch (Exception e)
	
	{
		
	System.out.println("Exception occurred :"+ e.toString());		
          }

  System.out.println("\nBasha\n51834537");	
      }

}