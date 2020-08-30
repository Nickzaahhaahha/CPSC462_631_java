class x {
    public static void main(String[] args) {
        int max = 0 , min = 999 , total = 0;
        double average;

        for(int i=0;i<args.length;i++) {
            if(Integer.parseInt(args[i]) > max) { 
                max = Integer.parseInt(args[i]);
              }              
              if(Integer.parseInt(args[i]) < min) { 
                min = Integer.parseInt(args[i]);
              }  
              total = total + Integer.parseInt(args[i]);           
        }
        average = total / args.length;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Total = " + total);
        System.out.println("Average = " +  average);
    }
}