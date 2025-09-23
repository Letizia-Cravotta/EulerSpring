package com.Kohaku.EulerSpringNew;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Component
public class Euler8 {
    private final int ADJACENT_DIGIT_COUNT = 13;
    private final String digitString = loadNumberFromFile("/euler_number.txt");
    @Autowired
    private MathHelper mathHelper;


    /**
     * Finds the largest product of any 13 adjacent digits within the 'checkDigitNumber' string.
     * This method iterates through the string using a sliding window of 13 characters,
     * calculates the product for each window, and keeps track of the maximum product found.
     *
     * @return The greatest product of 13 adjacent digits as a long. Returns 0 if no product is found
     * or if the string is shorter than 13 characters.
     */
    public long getLargestProduct() {
        long largestProduct = 0;

        for (int i = 0; i <= digitString.length() - ADJACENT_DIGIT_COUNT; i++) {
            long currentProduct = mathHelper.getProductOfNumbers(digitString.substring(i, i + ADJACENT_DIGIT_COUNT));
            if (currentProduct > largestProduct) {
                largestProduct = currentProduct;
            }
        }
        return largestProduct;
    }



    /**
     * Loads the numeric content from the resource file <code>euler_number.txt</code>.
     *
     * @return a string containing the entire number from the resource file
     * @throws RuntimeException if the resource cannot be found or read
     */
    private String loadNumberFromFile(String filePath) {

        // Try-with-resources block: ensures that resources (InputStream, BufferedReader)
        // are automatically closed after usage, even if an exception occurs.
        try (
                // Get the resource file as an InputStream.
                // Objects.requireNonNull(...) ensures that if the resource is not found,
                // a NullPointerException is thrown immediately (instead of silently failing).
                InputStream is = Objects.requireNonNull(Euler8.class.getResourceAsStream(filePath));

                // Wrap the InputStream with an InputStreamReader to convert raw bytes
                // into characters, explicitly using UTF-8 as the character encoding.
                InputStreamReader inputStreamReader = new InputStreamReader(is, StandardCharsets.UTF_8);

                // Wrap the InputStreamReader with a BufferedReader for efficient reading
                // of text data (it can read whole lines at a time instead of character by character).
                BufferedReader reader = new BufferedReader(inputStreamReader)) {

            return reader.lines().collect(Collectors.joining("")); // Read all lines from the file as a stream of strings

        } catch (IOException e) {
            // If there is an I/O error (e.g., file can’t be read),
            // wrap it into a RuntimeException and stop program execution.
            throw new RuntimeException("Failed to read the resource file.", e);
        }
    }
}

