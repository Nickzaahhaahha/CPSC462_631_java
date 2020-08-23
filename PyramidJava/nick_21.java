public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                for (suriya=nick; suriya <= 7; suriya++)
                {
                    System.out.print("*");
                }
                System.out.print(nick);
                for (suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print("*");
                }
                System.out.print(8-nick);
            System.out.println();
            }
	}
}
