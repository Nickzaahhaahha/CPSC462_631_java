public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		 for (nick=1; nick <= 5; nick++)
            {
                for (suriya=5; suriya >= nick; suriya--)
                {
                    System.out.print(suriya);
                }
                for (suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print("*");
                }
                for (suriya=2; suriya <= nick; suriya++)
                {
                    System.out.print("*");
                }
                for (suriya=nick; suriya <= 5; suriya++)
                {
                    System.out.print(suriya);
                } 
            System.out.println();
            }
	}
}
