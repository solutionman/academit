package academit.artamonov2016.range.logic;

// Object interval

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from < to) {
            this.from = from;
            this.to = to;
        } else {
            this.to = from;
            this.from = to;
        }
    }

    public boolean isInside(double number) {
        double epsilon = 0.00001;
        return ((number > from || Math.abs(number - from) < epsilon) && (number < to || Math.abs(number - to) < epsilon));
    }

    public double getLength() {
        return to - from;

    }


    public Range getIntersection(Range secondInterval) {

        double intersectionFrom = 0;
        double intersectionTo = 0;
        //case 1
        //  ------------
        //          -------------
        if (this.from < secondInterval.getFrom() && this.to < secondInterval.getTo() && this.to > secondInterval.getFrom()) {
            intersectionFrom = secondInterval.getFrom();
            intersectionTo = this.to;

            // case 2
            //        ---------------
            // ------------
        } else if (this.from > secondInterval.getFrom() && this.to > secondInterval.getTo() && this.from < secondInterval.getTo()) {
            intersectionFrom = this.from;
            intersectionTo = secondInterval.getTo();
            // case 3
            // ----------------------
            //       ---------
        } else if (this.from < secondInterval.getFrom() && this.to > secondInterval.getTo()) {
            intersectionFrom = secondInterval.getFrom();
            intersectionTo = secondInterval.getTo();
            // case 4
            //       ----------
            //  ----------------------
        } else if (this.from > secondInterval.getFrom() && this.to < secondInterval.getTo()) {
            intersectionFrom = this.from;
            intersectionTo = this.to;
            // case 5
            // ---------
            //              -----------
        } else if (this.from < secondInterval.getTo() && this.to < secondInterval.getTo() && this.to < secondInterval.getFrom()) {
            return null;
            // case 6
            //              -----------
            // ---------
        } else if (this.from > secondInterval.getFrom() && this.to > secondInterval.getTo() && this.from > secondInterval.getTo()) {
            return null;
        }


        return new Range(intersectionFrom, intersectionTo);
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
