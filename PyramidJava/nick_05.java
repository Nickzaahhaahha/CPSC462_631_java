public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 4; nick++)
            {            
                 for (suriya=4; suriya >= nick; suriya--)
                {
                    System.out.print(" "); 
                }
                    System.out.print(nick); 
                 for (suriya=2; suriya <= nick; suriya++)
                {
                    System.out.print("**"); 
                }
                    System.out.print(nick); 
            
            System.out.println(); 
            }
            
             for (nick=2; nick <= 4; nick++)
            {
             
                 for (suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print(" "); 
                }
                    System.out.print(5-nick); 
                 for (suriya=3; suriya >= nick; suriya--)
                {
                    System.out.print("**");
                }
                    System.out.print(5-nick); 
            
            System.out.println();
            }
	}
}