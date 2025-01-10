package main.pirvate_access;

public class PrinterPrivate {

    private PrinterPrivate(){}

   private void  print(int[] ar){
        System.out.print("{ ");
        for(Integer i:ar){
            System.out.print(i+" ");
        }
        System.out.print("}");
    }

}
