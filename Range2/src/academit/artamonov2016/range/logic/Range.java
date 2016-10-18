package academit.artamonov2016.range.logic;

// Check is the number inside

public class Range {
    private double from1;
    private double from2;

    public Range(double from1, double from2) {
        this.from1 = from1;
        this.from2 = from2;
    }

    public double calcLengthOfInterval(){
        return Math.abs(Math.abs(from1) - Math.abs(from2));

    }

    public double intersectLesserNumber;
    public double intersectBiggerNumber;

    public double lesserNumber;
    public double biggerNumber;

    public void calcIntersectionOfIntervals(){

        if(from1 > from2){
            lesserNumber = from1;
            biggerNumber = from2;
        // if from1 == from2 - it doesn't matter which sum we assign
        } else {
            lesserNumber = from2;
            biggerNumber = from1;
        }

        // case 1
        // -----------
        //       -----------
        if(firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber && firstIntervalBiggerNumber > secondIntervalLesserNumber) {
            intersectLesserNumber = secondIntervalLesserNumber;
            intersectBiggerNumber = firstIntervalBiggerNumber;
            // case 2
            //     --------------
            // -----------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber && firstIntervalLesserNumber < secondIntervalBiggerNumber) {
            intersectLesserNumber = firstIntervalLesserNumber;
            intersectBiggerNumber = secondIntervalBiggerNumber;
            // case 3
            // -------------------
            //     --------
        } else if (firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber){
            intersectLesserNumber = secondIntervalLesserNumber;
            intersectBiggerNumber = secondIntervalBiggerNumber;
            // case 4
            //      --------
            // -------------------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber){
            intersectLesserNumber = firstIntervalLesserNumber;
            intersectBiggerNumber = firstIntervalBiggerNumber;
            // case 5
            // -------
            //           --------
        } else if (firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber && firstIntervalBiggerNumber < secondIntervalLesserNumber){
            intersectLesserNumber = 0;
            intersectBiggerNumber = 0;
            // case 6
            //           --------
            // -------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber && firstIntervalLesserNumber > secondIntervalBiggerNumber) {
            intersectLesserNumber = 0;
            intersectBiggerNumber = 0;
        } else {
            intersectLesserNumber = 0;
            intersectBiggerNumber = 0;
        }

    }

    public double unionFirstIntervalLesserNumber;
    public double unionFirstIntervalBiggerNumber;
    public double unionSecondIntervalLesserNumber;
    public double unionSecondIntervalBiggerNumber;

    public void calcUnionIntervals(){
        double firstIntervalBiggerNumber;
        double firstIntervalLesserNumber;
        double secondIntervalBiggerNumber;
        double secondIntervalLesserNumber;

        if(from1 > from2){
            firstIntervalBiggerNumber = from1;
            firstIntervalLesserNumber = from2;
            // if from1 == from2 - it doesn't matter which sum we assign
        } else {
            firstIntervalBiggerNumber = from2;
            firstIntervalLesserNumber = from1;
        }

        if(from3 > from4){
            secondIntervalBiggerNumber = from3;
            secondIntervalLesserNumber = from4;
        } else {
            secondIntervalBiggerNumber = from4;
            secondIntervalLesserNumber = from3;
        }

        // case 1
        // -----------
        //       -----------
        if(firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber) {
            unionFirstIntervalLesserNumber = firstIntervalLesserNumber;
            unionFirstIntervalBiggerNumber = secondIntervalBiggerNumber;
            // case 2
            //     --------------
            // -----------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber) {
            unionFirstIntervalLesserNumber = secondIntervalLesserNumber;
            unionFirstIntervalBiggerNumber = firstIntervalBiggerNumber;
            // case 3
            // -------------------
            //     --------
        } else if (firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber){
            unionFirstIntervalLesserNumber = firstIntervalLesserNumber;
            unionFirstIntervalBiggerNumber = firstIntervalBiggerNumber;
            // case 4
            //      --------
            // -------------------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber){
            unionFirstIntervalLesserNumber = secondIntervalLesserNumber;
            unionFirstIntervalBiggerNumber = secondIntervalBiggerNumber;
            // case 5
            // -------
            //           --------
        } else if (firstIntervalLesserNumber < secondIntervalLesserNumber && firstIntervalBiggerNumber < secondIntervalBiggerNumber && firstIntervalBiggerNumber < secondIntervalLesserNumber){
            unionFirstIntervalLesserNumber = firstIntervalLesserNumber;
            unionFirstIntervalBiggerNumber = firstIntervalBiggerNumber;
            unionSecondIntervalLesserNumber = secondIntervalLesserNumber;
            unionSecondIntervalBiggerNumber = secondIntervalBiggerNumber;
            // case 6
            //           --------
            // -------
        } else if (firstIntervalLesserNumber > secondIntervalLesserNumber && firstIntervalBiggerNumber > secondIntervalBiggerNumber && firstIntervalLesserNumber > secondIntervalBiggerNumber) {
            unionFirstIntervalLesserNumber = firstIntervalLesserNumber;
            unionFirstIntervalBiggerNumber = firstIntervalBiggerNumber;
            unionSecondIntervalLesserNumber = secondIntervalLesserNumber;
            unionSecondIntervalBiggerNumber = secondIntervalBiggerNumber;
        }
    }

    public double firstMinusSecondLesserNumber;
    public double firstMinusSecondBigerNumber;
    public double firstMinusSecondLesserNumber2;
    public double firstMinusSecondBiggerNumber2;

    public void calcFirstMinusSecond (){
        double firstIntervalBiggerNumber;
        double firstIntervalLesserNumber;
        double secondIntervalBiggerNumber;
        double secondIntervalLesserNumber;

        if(from1 > from2){
            firstIntervalBiggerNumber = from1;
            firstIntervalLesserNumber = from2;
            // if from1 == from2 - it doesn't matter which sum we assign
        } else {
            firstIntervalBiggerNumber = from2;
            firstIntervalLesserNumber = from1;
        }

        if(from3 > from4){
            secondIntervalBiggerNumber = from3;
            secondIntervalLesserNumber = from4;
        } else {
            secondIntervalBiggerNumber = from4;
            secondIntervalLesserNumber = from3;
        }

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
}
