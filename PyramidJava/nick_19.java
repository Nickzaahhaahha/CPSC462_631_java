public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                System.out.print(nick);
                for (suriya=nick; suriya <= 9; suriya++)
                {
                    System.out.print("*");
                }
                for (suriya=2; suriya <= nick; suriya++)
                {
                    System.out.print(" ");
                }
                System.out.print(6-nick);
            System.out.println();
            }




	}
}
