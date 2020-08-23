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
                 for (suriya=0; suriya < 2 ; suriya++)
                {
                    System.out.print(suriya+nick);
                }
                for (suriya=4; suriya >= nick; suriya--)
                {
                    System.out.print(" ");
                }
                for (suriya=4; suriya >= nick; suriya--)
                {
                    System.out.print(" ");
                }
                for (suriya=1; suriya < 3; suriya++)
                {
                    System.out.print(((nick+1)*2)-(suriya+nick));
                }          
                System.out.println();
            }
	}
}
