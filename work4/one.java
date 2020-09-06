import java.io.*;
  class x {
    public static void main(String args[]) throws IOException {
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
      int i[] = {0,0,0,0,0};
      String buf1 ;
	
	  for(int j = 0;j<5;j++){
	buf1 = stdin.readLine();
	i[j] = Integer.parseInt(buf1);
}
System.out.println(i[0] + " + " + i[1] + " = " + (i[0] + i[1]));
System.out.println(i[2] + " - " + i[3] + " = " + (i[2] - i[3]));
System.out.println(i[4] + " * " + i[5] + " = " + (i[4] * i[5]));
System.out.println(i[5] + " / " + i[1] + " = " + (i[5] / i[1]));
System.out.println(i[1] + " + " + i[5] + " = " + (i[1] + i[5]));

}

}

