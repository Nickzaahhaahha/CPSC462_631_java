import java.io.*;
class aa{
    static String data[][] = new String[3][3];
        public static void aaa() throws IOException{
            BufferedReader numid = new BufferedReader (new InputStreamReader(System.in));
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i == 0){
                        System.out.print("enter id : ");
                        data[i][j] = numid.readLine(); 
                    }
                    else if(i == 1){
                        System.out.print("enter name : ");
                        data[i][j] = numid.readLine(); 
                    }
                    else if(i == 2){
                        System.out.print("enter salary : ");
                        data[i][j] = numid.readLine(); 
                    } 
                    else{
                        System.out.print("error");
                    }            
                }
            } 
        }        
}
class bb extends aa{
    public static void bbb() {
        try {
            aaa();
        int sum = 0 ;
        for(int i=0;i<3;i++){
        }
        System.out.println("-------------------------------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){		
                if(i == 0){
                    System.out.print("| id = " + data[i][j]);
                }
                else if(i == 1){
                    System.out.print("| name = " + data[i][j]);
                }
                else if(i == 2){
                    System.out.print("| salary = " + data[i][j]);
                }
                else{
                    System.out.print("error");
                }
                if(i == 2){
                    sum +=Integer.parseInt(data[2][j]);
                }           
            }
            System.out.println("|");
        }
        System.out.println("-------------------------------------");
        System.out.println("total = " + (sum)+ " $");
        System.out.println("Social security = " + (500)+ " $");
        System.out.println("tax 7% = " + (sum * 0.07)+ " $");
        System.out.println("Net salary = " + ((sum*0.93)-500) + " $");
        System.out.println("-------------------------------------");
        } catch (Exception e) {           
        }     
    }
}
class cc extends bb {
    public static void main(String args[]) {

        bbb();
    }
}


