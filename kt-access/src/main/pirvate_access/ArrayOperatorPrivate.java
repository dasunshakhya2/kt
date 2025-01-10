package main.pirvate_access;

public class ArrayOperatorPrivate implements SorterPrivate {

    private PrinterPrivate printerPrivate;

    private ArrayOperatorPrivate(PrinterPrivate printerPrivate) {
        this.printerPrivate = printerPrivate;
    }

    private ArrayOperatorPrivate() {
    }

    @Override
    public int[] sort(int[] ar, OrderPrivate orderPrivate) {

        for (int i = 0; i < ar.length; i++) {
            int tempVal = ar[i];
            int index = i;

            for (int j = i + 1; j < ar.length; j++) {
                if (orderPrivate == OrderPrivate.DEC) {
                    if (ar[j] < tempVal) {
                        tempVal = ar[j];
                        index = j;
                    }
                }
                if (orderPrivate == OrderPrivate.ASC) {
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
//        ArrayOperatorPrivate arrayOperatorPrivate = new ArrayOperatorPrivate(new PrinterPrivate()); // Need to invoke getInstance() since the constructor is private.
//        int[] cr = arrayOperatorPrivate.sort(ar, OrderPrivate.DEC);
//        arrayOperatorPrivate.printerPrivate.print(cr);

    }
}
