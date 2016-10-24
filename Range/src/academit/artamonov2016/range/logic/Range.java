package academit.artamonov2016.range.logic;

// Object interval

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if(from < to) {
            this.from = from;
            this.to = to;
        } else {
            this.to = from;
            this.from = to;
        }
    }

    public boolean isInside(double number) {
        double epsilon = 0.00001;
        return ((number > from || Math.abs(number - from) < epsilon) && (number < to || Math.abs(number - to ) < epsilon));
    }

    public double getLength(){
        return to - from;

    }


    public static Range getRangeObject(Range firstInterval, Range secondInterval) {

        double intersectionFrom = 0;
        double intersectionTo = 0;
        //case 1
        //  ------------
        //          -------------
        if(firstInterval.getFrom() < secondInterval.getFrom() && firstInterval.getTo() < secondInterval.getTo()){
            intersectionFrom = secondInterval.getFrom();
            intersectionTo = firstInterval.getTo();

            // case 2
            //        ---------------
            // ------------
        } else if(firstInterval.getFrom() > secondInterval.getFrom() && firstInterval.getTo() > secondInterval.getTo() ){
            intersectionFrom = firstInterval.getFrom();
            intersectionTo = secondInterval.getTo();
            // case 3
            // ----------------------
            //       ---------
        } else if(firstInterval.getFrom() < secondInterval.getFrom() && firstInterval.getTo() > secondInterval.getTo()){
            intersectionFrom = secondInterval.getFrom();
            intersectionTo = secondInterval.getTo();
            // case 4
            //       ----------
            //  ----------------------
        } else if(firstInterval.getFrom() > secondInterval.getFrom() && firstInterval.getTo() < secondInterval.getTo()){
            intersectionFrom = firstInterval.getFrom();
            intersectionTo = firstInterval.getTo();
        }

        Range intersection = new Range(intersectionFrom, intersectionTo);

        return intersection;
    }

    public double getFrom(){
        return from;
    }

    public double getTo(){
        return to;
    }
}
