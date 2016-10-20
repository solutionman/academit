package academit.artamonov2016.range.logic;



public class Difference {

    private double firstMinusSecondLesserNumber;
    private double firstMinusSecondBigerNumber;
    private double firstMinusSecondLesserNumber2;
    private double firstMinusSecondBiggerNumber2;

    public Difference(double firstIntervalLesserNumber, double firstIntervalBiggerNumber, double secondIntervalLesserNumber, double secondIntervalBiggerNumber){
        // case 1
        // -----------
        //       -----------
        if(firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber) {
            firstMinusSecondLesserNumber = firstIntervalLesserNumber;
            firstMinusSecondBigerNumber = secondIntervalLesserNumber;
            // case 2
            //     --------------
            // -----------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber) {
            firstMinusSecondLesserNumber = secondIntervalBiggerNumber;
            firstMinusSecondBigerNumber = firstIntervalBiggerNumber;
            // case 3
            // -------------------
            //     --------
        } else if (firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber){
            firstMinusSecondLesserNumber = firstIntervalLesserNumber;
            firstMinusSecondBigerNumber = secondIntervalLesserNumber;
            firstMinusSecondLesserNumber2 = secondIntervalBiggerNumber;
            firstMinusSecondBiggerNumber2 = firstIntervalBiggerNumber;
            // case 4
            //      --------
            // -------------------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber){
            firstMinusSecondLesserNumber = 0;
            firstMinusSecondBigerNumber = 0;
            // case 5
            // -------
            //           --------
        } else if (firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber && firstIntervalBiggerNumber < secondIntervalLesserNumber){
            firstMinusSecondLesserNumber = firstIntervalLesserNumber;
            firstMinusSecondBigerNumber = firstIntervalBiggerNumber;
            // case 6
            //           --------
            // -------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber && firstIntervalLesserNumber > secondIntervalBiggerNumber) {
            firstMinusSecondLesserNumber = firstIntervalLesserNumber;
            firstMinusSecondBigerNumber = firstIntervalBiggerNumber;
        }
    }

    public double getFirstMinusSecondLesserNumber(){
        return firstMinusSecondLesserNumber;
    }

    public double getFirstMinusSecondBigerNumber(){
        return firstMinusSecondBigerNumber;
    }

    public double getFirstMinusSecondLesserNumber2(){
        return firstMinusSecondLesserNumber2;
    }

    public double getFirstMinusSecondBiggerNumber2(){
        return getFirstMinusSecondLesserNumber2();
    }
}
