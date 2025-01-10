package main.protected_access;


public class Operator {

    public static void main(String[] args) {
        int[] ar = {2, 5, 6, 1, 0, 9};
        ArrayOperatorProtected arrayOperatorProtected = new ArrayOperatorProtected(new PrinterProtected());
        int[] cr = arrayOperatorProtected.sort(ar, OrderProtected.DEC);
        arrayOperatorProtected.printerProtected.print(cr);

    }
}
