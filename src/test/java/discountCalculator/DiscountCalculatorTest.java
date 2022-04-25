package discountCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    void shouldReturnStringHelloWorld(){
        String expectedValue = "Hello World";
        String actual = discountCalculator.healthCheck();

        Assertions.assertEquals(expectedValue, actual);
    }
}