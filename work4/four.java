import java.io.*;
  class x {
    public static void main(String args[]) throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      int a[] = {0,0,0,0,0};
      String buf1 ,buf2;
	  int total = 0 average = 0 , max = 0 , min = 9999 , loop = 0;
	
	  for(int j = 0;j<5;j++){
	    buf1 = stdin.readLine();
	    buf2 = stdin.readLine();
        a[j] = Integer.parseInt(buf1);
    
        for(int j = 0 ; j>5 ; j++)
        {
            if(a[j] > max){
                max += a[j];
            }
            if(a[j] < min){
                min=+ a[j];
            }
            total =+ a[j];
            loop++
        }
    }
    average = total / loop ;
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    System.out.println("total = " + total);
    System.out.println("average = " + average);

}
}
