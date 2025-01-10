package main.protected_access;

public class PrinterProtected {

    protected  PrinterProtected(){}

    public static PrinterProtected getInstance(){
        return  new PrinterProtected();
    }

    protected void print(int[] ar) {
        System.out.print("{ ");
        for (Integer i : ar) {
            System.out.print(i + " ");
        }
        System.out.print("}");
    }

}
