package academit.artamonov2016.range.logic;

// here we calculate the intersection of intervals

public class Intersection {
    private double intersectLesserNumber;
    private double intersectBiggerNumber;

    public Intersection (double firstIntervalLesserNumber, double firstIntervalBiggerNumber, double secondIntervalLesserNumber, double secondIntervalBiggerNumber){

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

    public double getIntersectLesserNumber(){
        return intersectLesserNumber;
    }

    public double getIntersectBiggerNumber(){
        return intersectBiggerNumber;
    }
}
