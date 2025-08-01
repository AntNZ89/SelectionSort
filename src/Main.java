public class Main {
    public static void main(String[] args) {

        double[] doubleArray = new double[10];

        for (int c = 0; c < doubleArray.length; c++){
            doubleArray[c] = Math.random();
        }
        sortArray(doubleArray);
    }

    public static void sortArray(double[] doubleArray){

        System.out.println(printArray(doubleArray));
        double[] sortedDoubles = new double[10];

        for (int c = 0; c < sortedDoubles.length; c++){

            sortedDoubles[c] = 0;
        }

        double highestNumber;

        for (int c = 0; c < doubleArray.length ; c++){

            highestNumber =  0;

            for (int r = 0; r < doubleArray.length; r++){

                if (c > 0){
                    if (doubleArray[r] > highestNumber && doubleArray[r] < sortedDoubles[Math.max(c-1, 0)]){
                        highestNumber = doubleArray[r];
                    }
                }
                else {
                    if (doubleArray[r] > highestNumber){
                        highestNumber = doubleArray[r];
                    }
                }
            }
            sortedDoubles[c] = highestNumber;
        }
        System.out.println(printArray(sortedDoubles));
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