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

    public String getToString(){
        return components.toString();
    }
}


