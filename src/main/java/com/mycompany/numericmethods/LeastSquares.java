
package com.mycompany.numericmethods;

/**
 *
 * @author sebah
 */
public class LeastSquares {
    
    int numPoints;
double [] x ; 
    double [] y; 
    
    public LeastSquares(int numPoints) {
        this.numPoints = numPoints;
         this.x = new double[numPoints];
        this.y = new double[numPoints];
    }
    
    public double sumX(){
        double sum=0.0;
        for (double valX: x){
            sum+=valX;
        }
        return sum;
    }
    
    
        public double sumY(){
        double sum=0.0;
        
        for (double valY: y){
            sum+=valY;
        }
        return sum;
    }
    
        
        public double sumXSquared(){
            double xSum=0.0;
         for (int i=0; i<x.length; i++) {
          double xSquared= x[i]*x[i]; 
          xSum+=xSquared;
            }
            return xSum;     
        }
    
    public double sumXperY(){
        double xySum=0.0;
        
         for (int i=0; i<x.length; i++) {
              double xy= x[i]*y[i]; 
              xySum+=xy;
         }
        return xySum;
        
        
    }
    
    public double determinant(){
        double det=(getNumPoints()*sumXSquared())-(sumX()*sumX());
        return det;
    }
    
      public double a0Det(){
           double det=(sumXSquared()*sumY())-(sumX()*sumXperY());
        return det;
      }
    
      
      public double a1Det(){
           double det=(getNumPoints()*sumXperY())-(sumX()*sumY());
        return det;
      }
    
      public double a0(){
          double a0=a0Det()/determinant();
          return a0;
      }
      
      public double a1(){
          double a1=a1Det()/determinant();
          return a1;
      }
    

    public int getNumPoints() {
        return numPoints;
    }

    public double[] getX() {
        return x;
    }

    public double[] getY() {
        return y;
    }
    
    
    
    
    
    public double evaluate (double x) {
        return a0()+(a1()*x);
    }
    
    
    
}
