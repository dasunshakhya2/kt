package main.public_access;

public class PrinterPublic {

  public   void  print(int[] ar){
        System.out.print("{ ");
        for(Integer i:ar){
            System.out.print(i+" ");
        }
        System.out.print("}");
    }

}
