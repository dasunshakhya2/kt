package main.public_access;




public class Operator {

    public static void main(String[] args) {
        int[] ar = {2, 5, 6, 1, 0, 9};
        ArrayOperatorPublic arrayOperatorPublic = new ArrayOperatorPublic(new PrinterPublic());
        arrayOperatorPublic.sort(ar,OrderPublic.ASC);
        arrayOperatorPublic.printerPublic.print(ar);
    }
}
