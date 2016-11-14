package vector.artamonov2016.logic;

public class Vector {
    public double[] components;

    public Vector(double n){
        for(int i = 0;  i < n; ++i ){
            this.components[i] = 0;
        }

    }

    // do not understand how to copy
    /*
    public Vector(Vector){

    }
    */

    public Vector(double[] arrayOfVectors){
        for(int i = 0; i < arrayOfVectors.length; ++i){
            this.components[i] = arrayOfVectors[i];
        }
    }

    public Vector(int n, double[] arrayOfVectors){
        for(int i = 0; i < n; ++i){
            if(i <= arrayOfVectors.length) {
                this.components[i] = arrayOfVectors[i];
            } else{
                this.components[i] = 0;
            }
        }
    }
}
