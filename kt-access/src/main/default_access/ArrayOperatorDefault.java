package main.default_access;

class ArrayOperatorDefault implements SorterDefault {

   PrinterDefault printerDefault;

    ArrayOperatorDefault(PrinterDefault printerDefault) {
     this.printerDefault = printerDefault;
    }

    @Override
    public int[] sort(int[] ar, OrderDefault orderDefault) {

        for (int i = 0; i < ar.length; i++) {
            int tempVal = ar[i];
            int index = i;

            for (int j = i + 1; j < ar.length; j++) {
                if (orderDefault == OrderDefault.DEC) {
                    if (ar[j] < tempVal) {
                        tempVal = ar[j];
                        index = j;
                    }
                }
                if (orderDefault == OrderDefault.ASC) {
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
        ArrayOperatorDefault arrayOperatorDefault = new ArrayOperatorDefault(new PrinterDefault());
        int[] cr = arrayOperatorDefault.sort(ar, OrderDefault.DEC);
        arrayOperatorDefault.printerDefault.print(cr);

    }
}
