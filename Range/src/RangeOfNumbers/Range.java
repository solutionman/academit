package RangeOfNumbers;

// Check is the number inside

class Range {
    private double from1;
    private double from2;

    Range(double from1, double from2) {
        this.from1 = from1;
        this.from2 = from2;
    }

    boolean isInside(double number) {
        double epsilon = 0.00001;
        return ((number > from1 || Math.abs(number - from1) < epsilon) && (number < from2 || Math.abs(number - from2 ) < epsilon));
    }

    double calcLengthOfInterval(){
        return Math.abs(Math.abs(from1) - Math.abs(from2));

    }

    

    double calcIntersectionOfIntervals(double secondInterval1, double secondInterval2){

        return 1;
    }
}
