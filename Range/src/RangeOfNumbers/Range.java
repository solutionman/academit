package RangeOfNumbers;

// Check is the number inside

class Range {
    private double from1;
    private double from2;
    private double from3;
    private double from4;

    Range(double from1, double from2, double from3, double from4) {
        this.from1 = from1;
        this.from2 = from2;
        this.from3 = from3;
        this.from4 = from4;
    }

    boolean isInside(double number) {
        double epsilon = 0.00001;
        return ((number > from1 || Math.abs(number - from1) < epsilon) && (number < from2 || Math.abs(number - from2 ) < epsilon));
    }

    double calcLengthOfInterval(){
        return Math.abs(Math.abs(from1) - Math.abs(from2));

    }

    double intersectLesserNumber;
    double intersectBiggerNumber;

    void calcIntersectionOfIntervals(){

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

    double unionFirstIntervalLesserNumber;
    double unionFirstIntervalBiggerNumber;
    double unionSecondIntervalLesserNumber;
    double unionSecondIntervalBiggerNumber;

    void calcUnionIntervals(){
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
}
