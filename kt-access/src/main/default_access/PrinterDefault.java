package main.default_access;

class PrinterDefault {

    void  print(int[] ar){
        System.out.print("{ ");
        for(Integer i:ar){
            System.out.print(i+" ");
        }
        System.out.print("}");
    }

}
