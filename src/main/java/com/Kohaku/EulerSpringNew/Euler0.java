package com.Kohaku.EulerSpringNew;

import org.springframework.stereotype.Component;

@Component
public class Euler0 {

    public long solve(int firstNSquareNumbers){
        long sum = 0L;
        for (Long k = 1L; k <= firstNSquareNumbers; k++) {
            Long square = k * k;
            if (isOdd(square)) {
                sum += square;
            }
        }
        return sum;
    }

    public boolean isSquareNumber(int n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public boolean isOdd(Long n){
        return n % 2 != 0;
    }
}
