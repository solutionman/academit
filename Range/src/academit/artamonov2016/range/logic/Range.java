package academit.artamonov2016.range.logic;

// Object interval

public class Range {
    private double from1;
    private double from2;

    public Range(double from1, double from2) {
        if(from1 < from2) {
            this.from1 = from1;
            this.from2 = from2;
        } else {
            this.from2 = from1;
            this.from1 = from2;
        }
    }

    public boolean isInside(double number) {
        double epsilon = 0.00001;
        return ((number > from1 || Math.abs(number - from1) < epsilon) && (number < from2 || Math.abs(number - from2 ) < epsilon));
    }

    public double getLength(){
        return from2 - from1;

    }

    public double getFrom1(){
        return from1;
    }

    public double getFrom2(){
        return from2;
    }
}
