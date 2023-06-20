import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    @Test
    public void testAddWithNegativeNumbers() {
        // Arrange
        String numbers = "-1,5";
        String expectedExceptionMessage = "Negatives not allowed: [-1]";

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add(numbers);
        }, expectedExceptionMessage);
    }

   // @Test
  //  public void testAddWithNumbersGreaterThan1000() {
        // Arrange
   //     String numbers = "1,1000";
   //     int expectedSum = 1;
  //      assertThrows(IndexOutOfBoundsException.class, () -> {
        // Act
      //  int sum = StringCalculator.add(numbers);

        // Assert
       // assertEquals(expectedSum, sum);
  //  }


    @Test
    public void testAddWithNumbersGreaterThan1000() {
        // Arrange
        String numbers = "1,1000";
        int expectedSum = 1;

        // Act
        int sum = StringCalculator.add(numbers);

        // Assert
        assertEquals(expectedSum, sum);
    }
}


