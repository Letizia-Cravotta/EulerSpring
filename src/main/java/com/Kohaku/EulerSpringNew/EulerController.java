package com.Kohaku.EulerSpringNew;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class EulerController {
    @Autowired
    private Euler10 euler10;
    @Autowired
    private Euler8 euler8;
    @Autowired
    private Euler7 euler7;
    @Autowired
    private Euler6 euler6;


    /**
     * Retrieves the solution for Project Euler 6.
     * Calculates the difference between the sum of the squares of the
     * first one hundred natural numbers and the square of the sum.
     *
     * @return A ResponseEntity containing the difference as an Integer.
     */
    @GetMapping(value="/euler6/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> euler6(){
        log.info("Result of Euler6: {}", euler6.sumSquareDifference());
        return ResponseEntity.ok(euler6.sumSquareDifference());
    }


    /**
     * Retrieves the nth prime number as calculated by Project Euler 7 logic.
     *
     * @param input The index of the prime number to find (e.g., 6 for the 6th prime).
     * @return A ResponseEntity containing the nth prime number as a Long.
     */
    @GetMapping(value="/euler7/{input}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> getResultEuler7(@PathVariable(value = "input") int input){
        log.info("Result of Euler7: {}", euler7.getNthPrimeNumber(input));
        return ResponseEntity.ok(euler7.getNthPrimeNumber(input));
    }


    /**
     * Retrieves the solution for Project Euler 8.
     * This endpoint calculates the greatest product of thirteen adjacent digits
     * in a 1000-digit number.
     *
     * @return A ResponseEntity containing the largest product as a Long.
     */
    @GetMapping(value="/euler8/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> getResultEuler8(){
        log.info("Result of Euler8: {}", euler8.getLargestProduct());
        return ResponseEntity.ok(euler8.getLargestProduct());
    }

    /**
     * REST controller endpoint to get the solution for Project Euler Problem 10.
     * <p>
     * This method handles HTTP GET requests to the {@code /euler10/} path. It calculates
     * the sum of all primes below two million, logs the result, and returns it in a JSON format
     * with an HTTP 200 (OK) status.
     *
     * @return A {@link ResponseEntity} containing the final sum as a long in the response body.
     */
    @GetMapping(value="/euler10/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> getResultEuler10(){
        log.info("Result of Euler10: {}", euler10.sumOfPrimesBelow2M());
        return ResponseEntity.ok(euler10.sumOfPrimesBelow2M());
    }





}
