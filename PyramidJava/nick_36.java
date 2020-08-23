public class Main
{
	public static void main(String[] args) 
    {
		int nick,suriya;
		for (nick=1; nick <= 3; nick++)
            {
                for (suriya=nick; suriya <= 3; suriya++)
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
                for (suriya=3; suriya >= nick; suriya--)
                {
                   System.out.print(suriya);
                }
                
           System.out.println();
            }
            for (nick=2; nick <= 3; nick++)
            {
                for (suriya=1; suriya <= nick; suriya++)
                {
                   System.out.print(4-(4-suriya));
                }
                for (suriya=nick; suriya <= 3; suriya++)
                {
                   System.out.print("*");
                }
                for (suriya=nick; suriya <= 2; suriya++)
                {
                   System.out.print("*");
                }
                for (suriya=1; suriya <= nick; suriya++)
                {
                   System.out.print(4-suriya);
                }
           System.out.println();
            } 




	}
}
