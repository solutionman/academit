package vector.artamonov2016.logic;

import java.util.ArrayList;

public class Vector {
    private ArrayList<Double> components = new ArrayList<Double>();

    public Vector(double n){
        for(int i = 0;  i < n; ++i ){
            this.components.add((double)0);
        }
    }

    public Vector(Vector forCopy){
        components = forCopy.components;
    }


    public Vector(double[] arrayOfVectors){
        for(int i = 0; i < arrayOfVectors.length; ++i){
            this.components.add(arrayOfVectors[i]);
        }
    }

    public Vector(int n, double[] arrayOfVectors){
        for(int i = 0; i < n; ++i){
            if(i < arrayOfVectors.length) {
                this.components.add(arrayOfVectors[i]);
            } else{
                this.components.add((double)0);
            }
        }
    }

    public int getSize() {
        return components.size();
    }

    public void setComponents(ArrayList<Double> components){
        this.components = components;
    }

    public String getToString(){
        return components.toString();
    }

    public ArrayList<Double> getComponents(){
        return components;
    }

    public Vector addition(Vector vector1, Vector vector2){

        if(vector1.getSize() != vector2.getSize()){
            System.out.println("Can't perform addition with these vectors");
            System.exit(0);
        }

        ArrayList<Double> forAddition1 = new ArrayList();
        forAddition1 = vector1.getComponents();
        ArrayList<Double> forAddition2 = new ArrayList();
        forAddition2 = vector2.getComponents();
        double[] arrayForAddition = new double[vector1.getSize()];
        for(int i = 0 ; i < vector1.getSize(); ++i){
            arrayForAddition[i] = (forAddition1.get(i) + forAddition2.get(i));
        }

        return new Vector(arrayForAddition);
    }

    public Vector subtraction(Vector vector1, Vector vector2){
        if(vector1.getSize() != vector2.getSize()){
            System.out.println("Can't perform subtraction between these vectors");
            System.exit(0);
        }

        ArrayList<Double> forSubtraction1 = new ArrayList();
        forSubtraction1 = vector1.getComponents();
        ArrayList<Double> forSubtraction2 = new ArrayList();
        forSubtraction2 = vector2.getComponents();
        double[] arrayForSubtraction = new double[vector1.getSize()];
        for(int i = 0; i < vector1.getSize(); ++i){
            arrayForSubtraction[i] = (forSubtraction1.get(i) - forSubtraction2.get(i));
        }

        return new Vector(arrayForSubtraction);
    }

    public Vector rotation(Vector vector){
        ArrayList<Double> forRotation = new ArrayList();
        forRotation = vector.getComponents();
        double[] arrayForRotation = new double[vector.getSize()];
        for(int i = 0; i < vector.getSize(); ++i){
            arrayForRotation[i] = forRotation.get(i) * (-1);
        }
        return new Vector (arrayForRotation);
    }
}


