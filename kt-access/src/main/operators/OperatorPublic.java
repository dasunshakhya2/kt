package main.operators;

import main.public_access.ArrayOperatorPublic;
import main.public_access.OrderPublic;
import main.public_access.PrinterPublic;

public class OperatorPublic {

    public static void main(String[] args) {
        int[] ar = {2, 5, 6, 1, 0, 9};
        ArrayOperatorPublic arrayOperatorPublic = new ArrayOperatorPublic(new PrinterPublic());
        arrayOperatorPublic.sort(ar, OrderPublic.ASC);
        arrayOperatorPublic.printerPublic.print(ar);
    }
}
