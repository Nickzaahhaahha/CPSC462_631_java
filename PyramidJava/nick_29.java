public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                System.out.print(nick);
                System.out.print("*");
                System.out.print(nick+2);
                for (suriya=1; suriya <= nick+2; suriya++)
                {
                    System.out.print("*");
                }  
            System.out.println();
            }
	}
}
