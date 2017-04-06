package vector.artamonov2016.main;


import vector.artamonov2016.logic.Vector;

public class MainVector {
    public static void main(String[] args) {

        Vector vectorNull = new Vector(2);

        double[] arrayForVector = {2, 4, 6};

        Vector vectorArray = new Vector(arrayForVector);

        Vector copyOfVectorArray = new Vector(vectorArray);

        Vector vectorArrayNull = new Vector(5, arrayForVector);

        System.out.println("Length of arrays is:");

        System.out.printf("vectorNull: %d   ", vectorNull.getSize());
        System.out.println(vectorNull.toString());
        System.out.printf("vectorArray: %d   ", vectorArray.getSize());
        System.out.println(vectorArray.toString());
        System.out.printf("copyOfVectorArray: %d   ", copyOfVectorArray.getSize());
        System.out.println(copyOfVectorArray.toString());
        System.out.printf("vectorArrayNull: %d   ", vectorArrayNull.getSize());
        System.out.println(vectorArrayNull.toString());

        Vector sumOfVectors = vectorArray.addition(vectorArray, copyOfVectorArray);
        System.out.println("The sum of vectorArray and copyOfVectorArray: " + sumOfVectors.toString());

        Vector subtractionOfVectors = vectorArray.subtraction(vectorArray, copyOfVectorArray);
        System.out.println("The subtraction of vectorArray and copyOfVectorArray: " + subtractionOfVectors.toString());

        Vector rotationOfVector = vectorArray.rotation(vectorArray);
        System.out.println("Rotated vector: " + rotationOfVector.toString());
    }
}


