public class Main
{
	public static void main(String[] args) 
    {
		  for (int nick=1; nick <= 4; nick++)
            {
             System.out.print(nick + "" + (nick+4));
                 for (int suriya=1; suriya <= nick+4; suriya++)
                {
                    System.out.print("*"); 
                }
            System.out.println(); 
            }
	}
}
