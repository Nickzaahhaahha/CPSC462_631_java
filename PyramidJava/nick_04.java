public class Main
{
	public static void main(String[] args) 
    {
		 for (int nick=1; nick <= 4 ; nick++)
            {
                 for (int suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print("*");
                }
                 for (int suriya=nick; suriya >= 2; suriya--)
                {
                    System.out.print(suriya);
                }
                for (int suriya=1; suriya <= nick; suriya++)
                {
                    System.out.print(suriya);
                }
            System.out.println();
            }
	}
}
