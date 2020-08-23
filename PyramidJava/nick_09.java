public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                for (suriya=1; suriya <= nick; suriya++)
                {
                   System.out.print(" ");
                }
                 for (suriya=4; suriya >= nick; suriya--)
                {
                   System.out.print(nick);
                }
               System.out.print(nick);
                for (suriya=4; suriya >= nick; suriya--)
                {
                   System.out.print(nick);
                }           
           System.out.println();
            }
	}
}
