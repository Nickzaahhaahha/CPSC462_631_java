public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                System.out.print("*");
                for (suriya=2; suriya <= nick; suriya++)
                {
                    System.out.print(" ");
                }
                for (suriya=nick; suriya <= 5; suriya++)
                {
                    System.out.print(nick);
                }
                for (suriya=nick; suriya <= 4; suriya++)
                {
                    System.out.print(nick);
                }
                for (suriya=2; suriya <= nick; suriya++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            System.out.println();
            }
	}
}
