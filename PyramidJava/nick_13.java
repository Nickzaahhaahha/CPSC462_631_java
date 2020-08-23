public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                for (suriya=2; suriya <= nick; suriya++)
                {
                    System.out.print(" ");
                }for (suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print(" ");
                }
                        
                for (suriya=nick; suriya <= 10-nick; suriya++)
                {
                    System.out.print(11-suriya-nick);
                }
                
                System.out.println();
            }
	}
}
