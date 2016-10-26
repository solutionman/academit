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

        //case 1
        //  ------------
        //          -------------
        if (this.from < secondInterval.from && this.to < secondInterval.to && this.to > secondInterval.from) {
            Range[] unionArray = new Range[1];
            unionArray[0] = new Range(this.from, secondInterval.to);
            return unionArray;
            // case 2
            //        ---------------
            // ------------
        } else if (this.from > secondInterval.from && this.to > secondInterval.to && this.from < secondInterval.to) {
            Range[] unionArray = new Range[1];
            unionArray[0] = new Range(secondInterval.from, this.to);
            return unionArray;
            // case 3
            // ----------------------
            //       ---------
        } else if (this.from < secondInterval.from && this.to > secondInterval.to) {
            Range[] unionArray = new Range[1];
            unionArray[0] = new Range(this.from, this.to);
            return unionArray;
            // case 4
            //       ----------
            //  ----------------------
        } else if (this.from > secondInterval.from && this.to < secondInterval.to) {
            Range[] unionArray = new Range[1];
            unionArray[0] = new Range(secondInterval.from, secondInterval.to);
            return unionArray;
            // case 5
            // ---------
            //              -----------
        } else if (this.to < secondInterval.from) {
            Range[] unionArray = new Range[2];
            unionArray[0] = new Range(this.from, this.to);
            unionArray[1] = new Range(secondInterval.from, secondInterval.to);
            return unionArray;
            // case 6
            //              -----------
            // ---------
        } else if (secondInterval.to < this.from) {
            Range[] unionArray = new Range[2];
            unionArray[0] = new Range(secondInterval.from, secondInterval.to);
            unionArray[1] = new Range(this.from, this.to);
            return unionArray;
        } else {
            return null;
        }

    }

    /*
    public List<Range> getUnionList(Range secondInterval) {
        List<Range> unionList = new ArrayList<Range>();

        if (this.from < secondInterval.from && this.to < secondInterval.to && this.to > secondInterval.from) {
            unionList.add(new Range(this.from, secondInterval.to));
        } else if (2 == 2) {
            //unionList.add(new Range(2, 5));
            //unionList.add(new Range(3, 4));
        } else {
            return null;
        }
        //list.add
        return unionList;
    }
*/

    public Range[] getFirstMinusSecond(Range secondInterval) {
        //case 1
        //  ------------
        //          -------------
        if (this.from < secondInterval.from && this.to < secondInterval.to && this.to > secondInterval.from) {
            Range[] firstMinusSecond = new Range[1];
            firstMinusSecond[0] = new Range(this.from, secondInterval.from);
            return firstMinusSecond;
            // case 2
            //        ---------------
            // ------------
        } else if (this.from > secondInterval.from && this.to > secondInterval.to && this.from < secondInterval.to) {
            Range[] firstMinusSecond = new Range[1];
            firstMinusSecond[0] = new Range(secondInterval.to, this.to);
            return firstMinusSecond;
            // case 3
            // ----------------------
            //       ---------
        } else if (this.from < secondInterval.from && this.to > secondInterval.to) {
            Range[] firstMinusSecond = new Range[2];
            firstMinusSecond[0] = new Range(this.from, secondInterval.from);
            firstMinusSecond[1] = new Range(secondInterval.to, this.to);
            return firstMinusSecond;
            // case 4
            //       ----------
            //  ----------------------
        } else if (this.from > secondInterval.from && this.to < secondInterval.to) {
            return null;
            // case 5
            // ---------
            //              -----------
        } else if (this.to < secondInterval.from) {
            Range[] firstMinusSecond = new Range[1];
            firstMinusSecond[0] = new Range(this.from, this.to);
            return firstMinusSecond;
            // case 6
            //              -----------
            // ---------
        } else if (secondInterval.to < this.from) {
            Range[] firstMinusSecond = new Range[1];
            firstMinusSecond[0] = new Range(this.from, this.to);
            return firstMinusSecond;
        } else {
            return null;
        }
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
