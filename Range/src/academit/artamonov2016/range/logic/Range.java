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

        // case 5
        // ---------
        //              -----------
        if (this.to < secondInterval.from) {
            return null;
            // case 6
            //              -----------
            // ---------
        } else if (this.from > secondInterval.to) {
            return null;

            //case 1
            //  ------------
            //          -------------
        } else if (this.from < secondInterval.from && this.to < secondInterval.to) {
            intersectionFrom = secondInterval.from;
            intersectionTo = this.to;

            // case 2
            //        ---------------
            // ------------
        } else if (this.from > secondInterval.from && this.to > secondInterval.to) {
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

        }

        return new Range(intersectionFrom, intersectionTo);
    }

    public Range[] getUnionArray(Range secondInterval) {

        // case 5
        // ---------
        //              -----------
        if (this.to < secondInterval.from) {
            Range unionArray1 = new Range(this.from, this.to);
            Range unionArray2 = new Range(secondInterval.from, secondInterval.to);
            return new Range[]{unionArray1, unionArray2};
            // case 6
            //              -----------
            // ---------
        } else if (secondInterval.to < this.from) {
            Range unionArray1 = new Range(secondInterval.from, secondInterval.to);
            Range unionArray2 = new Range(this.from, this.to);
            return new Range[]{unionArray1, unionArray2};

        } else {
            Range unionArray = new Range(Math.min(this.from, secondInterval.from), Math.max(this.to, secondInterval.to));
            return new Range[]{unionArray};
        }

    }


    public Range[] getFirstMinusSecond(Range secondInterval) {

        // case 5
        // ---------
        //              -----------
        if (this.to < secondInterval.from) {
            Range firstMinusSecond = new Range(this.from, this.to);
            return new Range[]{firstMinusSecond};
            // case 6
            //              -----------
            // ---------
        } else if (secondInterval.to < this.from) {
            Range firstMinusSecond = new Range(this.from, this.to);
            return new Range[]{firstMinusSecond};

            //case 1
            //  ------------
            //          -------------
        } else if (this.from < secondInterval.from && this.to < secondInterval.to) {
            Range firstMinusSecond = new Range(this.from, secondInterval.from);
            return new Range[]{firstMinusSecond};
            // case 2
            //        ---------------
            // ------------
        } else if (this.from > secondInterval.from && this.to > secondInterval.to) {
            Range firstMinusSecond = new Range(secondInterval.to, this.to);
            return new Range[]{firstMinusSecond};
            // case 3
            // ----------------------
            //       ---------
        } else if (this.from < secondInterval.from && this.to > secondInterval.to) {
            Range firstMinusSecond1 = new Range(this.from, secondInterval.from);
            Range firstMinusSecond2 = new Range(secondInterval.to, this.to);
            return new Range[]{firstMinusSecond1, firstMinusSecond2};
            // case 4
            //       ----------
            //  ----------------------
        } else if (this.from > secondInterval.from && this.to < secondInterval.to) {
            return new Range[]{};

        } else {
            return new Range[]{};
        }
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
