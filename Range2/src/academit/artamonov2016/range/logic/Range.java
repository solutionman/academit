package academit.artamonov2016.range.logic;

// Check is the number inside

public class Range {
    private double from1;
    private double from2;

    public Range(double from1, double from2) {
        if(from1 < from2){
            this.from1 = from1;
            this.from2 = from2;
        } else {
            this.from2 = from1;
            this.from1 = from2;
        }

    }


    public double getFrom1 (){
        return from1;
    }

    public double getFrom2 (){
        return from2;
    }
}
