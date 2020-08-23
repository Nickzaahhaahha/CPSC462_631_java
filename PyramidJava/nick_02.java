public class Main
{
	public static void main(String[] args) 
    {
		for (int nick=1; nick <= 4; nick++)
         {
            for (int suriya=nick; suriya <= nick+2; suriya++)
            {
                System.out.print(suriya); 
            }
            for (int suriya=1; suriya <= (nick + 2); suriya++)
            {
                System.out.print("*"); 
            }
               System.out.println(); 
        }
	}
}
