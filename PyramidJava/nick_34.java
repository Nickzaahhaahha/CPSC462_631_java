public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 3; nick++)
            {
                for (suriya=3; suriya >= nick; suriya--)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print(nick);
                }
                for (suriya=2; suriya <= nick; suriya++)
                {
                    System.out.print(nick);
                }
                System.out.print("*");
                
            System.out.println();
            }
            for (nick=1; nick <= 2; nick++)
            {
                for (suriya=1; suriya <= nick+1; suriya++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (suriya=nick; suriya <= 2; suriya++)
                {
                    System.out.print(3-nick);
                }
                for (suriya=nick; suriya <= 1; suriya++)
                {
                    System.out.print(3-nick);
                }
                System.out.print("*");
            System.out.println();
            }




	}
}
