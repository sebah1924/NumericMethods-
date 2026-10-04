/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numericmethods;

/**
 *
 * @author sebah
 */
public class NumericMethods {

    public static void main(String[] args) {
        
        
        LeastSquares l = new LeastSquares(6);
        
        l.getX()[0]=16;
         l.getX()[1]=18;
          l.getX()[2]=20;
           l.getX()[3]=22;
            l.getX()[4]=24;
             l.getX()[5]=26;
        
             
              l.getY()[0]=12;
         l.getY()[1]=15;
          l.getY()[2]=21;
           l.getY()[3]=24;
            l.getY()[4]=30;
             l.getY()[5]=32;
             
             
             System.out.println("Inicio = " + l.a0());
              System.out.println("Inclinacion = " + l.a1());
              
              System.out.println("La formula de la recta es : Y= " + l.a0() + " + " + l.a1() + " *  x " );
              
              
                System.out.println("Consultar = " + l.evaluate(28));
        
        
        
        
    }
}
