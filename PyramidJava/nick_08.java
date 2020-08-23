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
                for (suriya=0; suriya < 3; suriya++)
                {
                    System.out.print(suriya+nick);
                }
                for (suriya=0; suriya <= nick; suriya++)
                {
                    System.out.print("*");
                }
            System.out.println();
            }
	}
}
