package academit.artamonov2016.range.logic;

// Union of intervals

public class Union {

    private double unionFirstIntervalLesserNumber;
    private double unionFirstIntervalBiggerNumber;
    private double unionSecondIntervalLesserNumber;
    private double unionSecondIntervalBiggerNumber;

    public Union (double firstIntervalLesserNumber, double firstIntervalBiggerNumber, double secondIntervalLesserNumber, double secondIntervalBiggerNumber){
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

    public double getUnionFirstIntervalLesserNumber(){
        return unionFirstIntervalLesserNumber;
    }

    public double getUnionFirstIntervalBiggerNumber(){
        return unionFirstIntervalBiggerNumber;
    }

    public double getUnionSecondIntervalLesserNumber(){
        return unionSecondIntervalLesserNumber;
    }

    public double getUnionSecondIntervalBiggerNumber(){
        return unionSecondIntervalBiggerNumber;
    }
}
