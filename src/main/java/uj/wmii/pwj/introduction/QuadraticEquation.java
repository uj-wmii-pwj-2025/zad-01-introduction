package uj.wmii.pwj.introduction;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if(delta < 0){
            return new double[0];
        }
        else if(delta == 0){
            double x = -b / (2 * a);
            return new double[] { x };
        }
        else{
            double sqrt = Math.sqrt(delta);
            double x1 = (-b + sqrt) / (2 * a);
            double x2 = (-b - sqrt) / (2 * a);
            return new double[] { x1, x2 };
        }
    }
}

