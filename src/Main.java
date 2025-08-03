import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        double[] doubleArray = createArray(10);

        sortArray(doubleArray);

    }




    public static void sortArray(double[] doubleArray){

        System.out.println(printArray(doubleArray));

        double highestNumber;
        int index;

        for (int c = 0; c < doubleArray.length ; c++){

            highestNumber =  1;
            index = 0;

            for (int r = c; r < doubleArray.length; r++){

                if (doubleArray[r] < highestNumber){


                    highestNumber = doubleArray[r];
                    index = r;
                }

                if (r == doubleArray.length-1){

                    doubleArray[index] = doubleArray[c];
                    doubleArray[c] = highestNumber;

                }
            }
        }
        System.out.println(printArray(doubleArray));
    }


    public static double[] createArray(int length){


        double[] doubleArray = new double[length];

        for (int c = 0; c < doubleArray.length; c++){
            doubleArray[c] = Math.random();
        }

        return doubleArray;

    }


    public static String printArray(double[] doubles){

        String s = "[";

        for (int c = 0 ; c < doubles.length ; c++){
            if (c == doubles.length-1){
                s += doubles[c];
            }
            else {
                s += doubles[c];
                s += " , ";
            }
        }
        s += "]";
        return s;
    }
}