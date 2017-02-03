package vector.artamonov2016.logic;

import java.util.ArrayList;

public class Vector {
    private double [] components ;

    public Vector(int n){

        if(n < 0){
            System.out.println("Can't create such vector, the number must be a positive number ");
            System.exit(0);
        }

        this.components = new double[n];
        for(int i = 0;  i < n; ++i ){
            components[i] = 0;
        }
    }

    public Vector(Vector forCopy){
        this.components = new double[forCopy.getComponents().length];
        for(int i = 0; i < forCopy.getComponents().length; ++i){
            this.components[i] = forCopy.getComponents()[i];
        }
    }


    public Vector(double[] arrayOfVectors){
        this.components = new double[arrayOfVectors.length];
        for(int i = 0; i < arrayOfVectors.length; ++i){
            this.components[i] = arrayOfVectors[i];
        }
    }

    public Vector(int n, double[] arrayOfVectors){

        if(n < 0){
            System.out.println("Can't create such vector, the number must be a positive number ");
            System.exit(0);
        }

        this.components = new double[n];
        for(int i = 0; i < n; ++i){
            if(i < arrayOfVectors.length) {
                this.components[i] = arrayOfVectors[i];
            } else{
                this.components[i] = 0;
            }
        }
    }

    public int getSize() {
        return components.length;
    }

    public String toString(){
        return components.toString();
    }

    public double[] getComponents(){
        return components;
    }

    public Vector addition(Vector vector1, Vector vector2){

        if(vector1.getSize() != vector2.getSize()){
            System.out.println("Can't perform addition with these vectors");
            System.exit(0);
        }

        double[] forAddition1 = new double[vector1.getSize()];
        forAddition1 = vector1.getComponents();
        double[] forAddition2 = new double[vector2.getSize()];
        forAddition2 = vector2.getComponents();
        double[] arrayForAddition = new double[vector1.getSize()];
        for(int i = 0 ; i < vector1.getSize(); ++i){
            arrayForAddition[i] = (forAddition1[i] + forAddition2[i]);
        }

        return new Vector(arrayForAddition);
    }

    public Vector subtraction(Vector vector1, Vector vector2){
        if(vector1.getSize() != vector2.getSize()){
            System.out.println("Can't perform subtraction between these vectors");
            System.exit(0);
        }

        double[]forSubtraction1 = new double[vector1.getSize()];
        forSubtraction1 = vector1.getComponents();
        double[] forSubtraction2 = new double[vector2.getSize()];
        forSubtraction2 = vector2.getComponents();
        double[] arrayForSubtraction = new double[vector1.getSize()];
        for(int i = 0; i < vector1.getSize(); ++i){
            arrayForSubtraction[i] = (forSubtraction1[i] - forSubtraction2[i]);
        }

        return new Vector(arrayForSubtraction);
    }

    public Vector rotation(Vector vector){
        double[] forRotation = new double[vector.getSize()];
        forRotation = vector.getComponents();
        double[] arrayForRotation = new double[vector.getSize()];
        for(int i = 0; i < vector.getSize(); ++i){
            arrayForRotation[i] = forRotation[i] * (-1);
        }
        return new Vector (arrayForRotation);
    }
}


