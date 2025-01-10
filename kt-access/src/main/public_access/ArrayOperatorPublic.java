package main.public_access;

public class ArrayOperatorPublic implements SorterPublic {

    public PrinterPublic printerPublic;

    public ArrayOperatorPublic(PrinterPublic printerPublic) {
        this.printerPublic = printerPublic;
    }

    @Override
    public int[] sort(int[] ar, OrderPublic orderPublic) {

        for (int i = 0; i < ar.length; i++) {
            int tempVal = ar[i];
            int index = i;

            for (int j = i + 1; j < ar.length; j++) {
                if (orderPublic == OrderPublic.DEC) {
                    if (ar[j] < tempVal) {
                        tempVal = ar[j];
                        index = j;
                    }
                }
                if (orderPublic == OrderPublic.ASC) {
                    if (ar[j] > tempVal) {
                        tempVal = ar[j];
                        index = j;
                    }
                }


            }
            int temp = ar[i];
            ar[i] = tempVal;
            ar[index] = temp;

        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {2, 5, 6, 1, 0, 9};
        ArrayOperatorPublic arrayOperatorPublic = new ArrayOperatorPublic(new PrinterPublic());
        int[] cr = arrayOperatorPublic.sort(ar, OrderPublic.DEC);
        arrayOperatorPublic.printerPublic.print(cr);

    }
}
