public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 7; nick++)
            {
                 for (suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print(" ");
                }
                for (suriya=6; suriya >= nick; suriya--)
                {
                    System.out.print((suriya-1)%2);
                }
                System.out.print((nick)%2);
                
                for (suriya=nick; suriya <= 6; suriya++)
                {
                    System.out.print((suriya-1)%2);
                }
            System.out.println();
            }
	}
}
