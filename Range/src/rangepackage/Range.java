package rangepackage;

// Check is the number inside

class Range {
    private double from1;
    private double from2;

    Range(double from1, double from2){
        this.from1 = from1;
        this.from2 = from2;
    }

    boolean isInside(double number){
        return (number> from1 && number < from2);
    }
}
