// check is the number inside the interval

package academit.artamonov2016.range.logic;

public class IsInside {

    public static boolean checkIsInsideInterval(double firstNumber, double secondNumber, double checkNumber){

        double epsilon = 0.0001;

        return((firstNumber < checkNumber || Math.abs(firstNumber - checkNumber) < epsilon ) && (checkNumber < secondNumber && Math.abs(secondNumber - checkNumber) < epsilon));

    }
}
