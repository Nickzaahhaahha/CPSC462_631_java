import java.io.*;
  class x {
    public static void main(String args[]) throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      int a[] = {0,0,0,0,0};
      String buf1 ,buf2;
	
	  for(int j = 0;j<6;j++){
	    buf1 = stdin.readLine();
	    a[j] = Integer.parseInt(buf1);   
            try{
                    System.out.print(a[j]);
                }catch(Exception IndexOutOfBoundsException e){
                     System.out.print("IndexOutOfBoundsException");
                }
        }
    }
}
