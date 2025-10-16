package com.Kohaku.EulerSpringNew;

import org.springframework.stereotype.Component;

@Component
public class Euler9 {

    /**
     * Finds the product a * b * c of the Pythagorean triplet for which a + b + c equals the specified sum.
     * If no such triplet exists, returns -1.
     *
     * @param sumOfABC the target sum for a + b + c
     * @return the product a * b * c if a valid triplet is found, otherwise -1
     */
   public int solve(int sumOfABC){
       for(int a=1; a<sumOfABC; a++){
           for(int b=a; b<sumOfABC; b++){
               int c = sumOfABC - a - b;
               if(c > b && isPythagoreanTriplet(a, b, c)){
                   return a*b*c;
               }
           }
       }
       return -1;
   }

   public boolean isPythagoreanTriplet(int a, int b, int c){
       return a*a + b*b == c*c;
   }

}
