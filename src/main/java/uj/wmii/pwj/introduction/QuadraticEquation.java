package uj.wmii.pwj.introduction;



public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        if(Math.abs(a) < 1e-12)
        {
            if(Math.abs(b) < 1e-12)
            {
                throw new IllegalArgumentException("Invalid equation");
            }
          return new double[] {c / b};  
        } 

        double delta = Math.pow(a , 2) - 4 * a * c;

        double x1 = (-b - Math.sqrt(delta) ) / 4 * a;
        double x2 = (-b + Math.sqrt(delta) ) / 4 * a;

        return new double[]{x1, x2};
    }

}

