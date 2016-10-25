package academit.artamonov2016.range.logic;

// Object interval

import java.util.ArrayList;
import java.util.List;

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
        if (this.from < secondInterval.from && this.to < secondInterval.to && this.to > secondInterval.from) {
            intersectionFrom = secondInterval.from;
            intersectionTo = this.to;

            // case 2
            //        ---------------
            // ------------
        } else if (this.from > secondInterval.from && this.to > secondInterval.to && this.from < secondInterval.to) {
            intersectionFrom = this.from;
            intersectionTo = secondInterval.to;
            // case 3
            // ----------------------
            //       ---------
        } else if (this.from < secondInterval.from && this.to > secondInterval.to) {
            intersectionFrom = secondInterval.from;
            intersectionTo = secondInterval.to;
            // case 4
            //       ----------
            //  ----------------------
        } else if (this.from > secondInterval.from && this.to < secondInterval.to) {
            intersectionFrom = this.from;
            intersectionTo = this.to;
            // case 5
            // ---------
            //              -----------
        } else if (this.to < secondInterval.from) {
            return null;
            // case 6
            //              -----------
            // ---------
        } else if (this.from > secondInterval.to) {
            return null;
        }

        return new Range(intersectionFrom, intersectionTo);
    }

    public Range[] getUnionArray(Range secondInterval) {
        //Range[] array = new Range[3];

        //case 1
        //  ------------
        //          -------------
        if (this.from < secondInterval.from && this.to < secondInterval.to && this.to > secondInterval.from) {
            Range[] unionArray = new Range[2];
            unionArray[1].from = this.from;
            unionArray[1].to = secondInterval.to;
            return unionArray;
        } else if (2 == 2) {
            Range[] array = new Range[3];
            return array;
        } else {
            return null;
        }

    }

    public List<Range> getUnion2(Range secondInterval) {
        List<Range> list = new ArrayList<Range>();

        if (1 == 1) {
            list.add(new Range(1, 3));
        } else if (2 == 2) {
            list.add(new Range(2, 5));
            list.add(new Range(3, 4));
        } else {
            return null;
        }
        //list.add
        return list;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
