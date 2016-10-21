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

    public double getFrom(){
        return from;
    }

    public double getTo(){
        return to;
    }

    public double calcIntersection() {
        Range intersection = new Range(1, 3);
        return 1;
    }
}
