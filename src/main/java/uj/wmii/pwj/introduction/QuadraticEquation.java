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

        double delta = Math.pow(b , 2) - 4 * a * c;
        
        if (delta < 0) return new double[]{};
        
        double x1 = (-b - Math.sqrt(delta) ) / (2 * a);
        double x2 = (-b + Math.sqrt(delta) ) / (2 * a);

        if (delta == 0.0) return new double[]{x1};
        return new double[]{x1, x2};
    }

}

