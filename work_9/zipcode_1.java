import java.io.*;
class x {
    public static void main(String args [])throws IOException {
        System.out.print("Input ID : ");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String getzipcode = stdin.readLine();
        int i= 1;
        String b;
        String[] fields;
        String patternStr = ",";
        FileReader fin = new FileReader("zipcode1.txt");
        BufferedReader bin = new BufferedReader (fin);
        // System.out.println(b = bin.readLine()); 
        while ((b = bin.readLine()) != null) {
            fields = b.split(patternStr);
            if(fields[0].equals(getzipcode)){
                System.out.println("zipcode : " + fields[1]);
                System.out.println("latitude : " + fields[4]);
                System.out.println("longitude : " + fields[5]);
            }
            i=i+1;
        }
        fin.close();
    }
}