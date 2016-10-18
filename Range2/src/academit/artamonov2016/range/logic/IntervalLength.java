package academit.artamonov2016.range.logic;

public class IntervalLength {
    public static double calcLengthOfInterval (double firstNumber, double secondNumber){
        return Math.abs(Math.abs(firstNumber) - Math.abs(secondNumber));
    }
}
