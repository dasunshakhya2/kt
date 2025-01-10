package main.protected_access;

public class ArrayOperatorProtected implements SorterProtected {

    protected PrinterProtected printerProtected;


    protected  ArrayOperatorProtected(){}

    protected ArrayOperatorProtected(PrinterProtected printerProtected) {
        this.printerProtected = printerProtected;
    }

    public void setPrinterProtected(PrinterProtected printerProtected){
        this.printerProtected = printerProtected;
    }

    @Override
    public int[] sort(int[] ar, OrderProtected orderProtected) {

        for (int i = 0; i < ar.length; i++) {
            int tempVal = ar[i];
            int index = i;

            for (int j = i + 1; j < ar.length; j++) {
                if (orderProtected == OrderProtected.DEC) {
                    if (ar[j] < tempVal) {
                        tempVal = ar[j];
                        index = j;
                    }
                }
                if (orderProtected == OrderProtected.ASC) {
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

//    public static void main(String[] args) {
//        int[] ar = {2, 5, 6, 1, 0, 9};
//        ArrayOperatorProtected arrayOperatorProtected = new ArrayOperatorProtected(new PrinterProtected());
//        int[] cr = arrayOperatorProtected.sort(ar, OrderProtected.DEC);
//        arrayOperatorProtected.printerProtected.print(cr);
//
//    }
}
