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

    double calcIntersectionOfIntervals(){

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

        if(firstIntervalLesserNumber < secondIntervalBiggerNumber && firstIntervalBiggerNumber > secondIntervalLesserNumber) {
            intersectLesserNumber = secondIntervalLesserNumber;
            intersectBiggerNumber = firstIntervalBiggerNumber;
        }

        return -1;
    }
}
