package uj.wmii.pwj.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuadraticEquation {
    private static final Logger log = LoggerFactory.getLogger(QuadraticEquation.class);
    public double[] findRoots(double a, double b, double c) {
        /* Infinite number of solutions case - not specified in the task
        Handling this case depends on whether we restrict values of a,b,c in any way
         */
        if (a == 0 && b == 0 && c == 0) {
            log.info("Provided equation is 0 = 0, therefore has infinite number of solutions.");
            return null; //Handled differently than typical "No solutions case", as 0 = 0 is true for every x
        }

        double delta = b * b - 4.0 * a * c;

        if (delta == 0.0) { //One solution
            double x = -b / (2 * a);
            return new double[]{x};
        } else if (delta > 0.0) { //Two solutions
            double deltaSqrt = Math.sqrt(delta);
            double x1 = (-b - deltaSqrt) / (2 * a);
            double x2 = (-b + deltaSqrt) / (2 * a);
            return new double[]{x1, x2};
        }
        return new double[0]; //No solutions
    }

}

