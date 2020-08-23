public class Main
{
	public static void main(String[] args) 
    {
		 
        for(int nick=1;nick<=4;nick++)
            {
                for(int suriya=1;suriya<=nick;suriya++)
                {
                     System.out.print(" ");
                }
                System.out.print(nick +""+ nick);
                for(int suriya=3;suriya>=nick;suriya--)
                {
                     System.out.print("**");
                }
                System.out.print(nick +""+ nick);
                System.out.println();            
            }
	}
}
