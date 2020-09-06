import java.io.*;
  class x {
    public static void main(String args[]) throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      int a[] = {0,0,0,0,0};
      String buf1 ,buf2;
	
	  for(int j = 0;j<5;j++){
	    buf1 = stdin.readLine();
	    a[j] = Integer.parseInt(buf1);   
            try{
                    System.out.print(a[1] / a[2] );
                }catch(Exception ArithmeticException e){
                     System.out.print("ArithmeticException ");
                }
        }
    }
}
