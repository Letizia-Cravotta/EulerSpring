package com.Kohaku.EulerSpringNew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Euler10 {
    @Autowired
    private MathHelper mathHelper;

    /**
     * Calculates the sum of all prime numbers below two million.
     * <p>
     * This method uses the {@link MathHelper} to generate a list of all prime numbers less than
     * or equal to 2,000,000 and then computes their sum.
     *
     * @return The total sum of all primes below two million.
     */
    public long sumOfPrimesBelow2M(){
        long sum = 0;
        List<Long> primeNumbers = mathHelper.getPrimeNumbers(2_000_000L);

        for(long primeNumber : primeNumbers){
            sum += primeNumber;
        }
        return sum;
    }
}
