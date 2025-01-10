package main.default_access;

public class Operator {

    public static void main(String[] args) {
        int[] ar = {2, 5, 6, 1, 0, 9};
        ArrayOperatorDefault arrayOperatorDefault = new ArrayOperatorDefault(new PrinterDefault());
        int[] cr = arrayOperatorDefault.sort(ar, OrderDefault.DEC);
        arrayOperatorDefault.printerDefault.print(cr);

    }
}
