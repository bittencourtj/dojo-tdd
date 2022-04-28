package discountCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();

   @Test
    void shouldNotGiveDiscountWhenValueIsBelowOrEquals499_99() {
       Double expectedDiscount = 0D;
       Double value = 350D;

       Double discount = discountCalculator.getDiscount(value);

       Assertions.assertEquals(expectedDiscount, discount);
   }
}