package uj.wmii.pwj.introduction;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        double[] roots;
        double epsilon = 0.001;
        double delta = (b * b) - (4 * a * c);
        if ( delta + epsilon <= 0 ) { //zero
            roots = new double[0];
            return roots;
        }
        if ( delta - epsilon >= 0 ) { //two
            roots = new double[2];
            double difference = Math.sqrt(delta) / ( 2 * a );
            roots[0] = ( -b ) / ( 2 * a ) - difference;
            roots [1] = roots[0] + 2 * difference;
            return roots;
        }
        //one
        roots = new double[1];
        roots[0] = ( -b ) / ( 2 * a );
        return roots;
    }

}

