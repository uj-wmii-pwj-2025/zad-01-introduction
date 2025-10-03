package uj.wmii.pwj.introduction;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        // What if a,b,c == 0 ?

        double D = b * b - 4 * a * c;

        if (D < 0) {
            return new double[0];
        }

        double[] res;

        if (D < 0.0000001) {
            res = new double[1];
            res[0] = -b / (2 * a);
        }
        else {
            res = new double[2];
            res[0] = (-b + Math.sqrt(D)) / (2 * a);
            res[1] = (-b - Math.sqrt(D)) / (2 * a);
        }

        return res;
    }

}

