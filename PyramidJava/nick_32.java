public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                for (suriya=7; suriya >= nick; suriya--)
                {
                    System.out.print(8-suriya);
                }
                for (suriya=1; suriya <= nick+2; suriya++)
                {
                    System.out.print("*");
                }
                System.out.print(nick+2) ;  
            System.out.println();
            }
	}
}
