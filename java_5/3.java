import java.util.*;
 
class x {
 
    public static void main(String []args) {
 
     ArrayList<Integer> IntegerArrLst = new ArrayList<Integer>(); 

        IntegerArrLst.add(1);
        IntegerArrLst.add(2);
        IntegerArrLst.add(3);
        IntegerArrLst.add(4);
        IntegerArrLst.add(5);
 
        for (int IntgerArrItem : IntegerArrLst) {

                 System.out.println("The Integer item in ArrayList: " + IntgerArrItem);
              }
 }           
}