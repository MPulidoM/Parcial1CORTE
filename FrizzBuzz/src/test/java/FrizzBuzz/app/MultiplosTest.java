package FrizzBuzz.app;

import org.junit.Assert;
import org.junit.Test;

public class MultiplosTest{
    private Multiplos multiplosPr = new Multiplos();

    @Test
    public void FizzBuzzMultiplos_Buzz_num_Multiplos5 {
        // Arrange
        int num = 5;
        String esperado = "Buzz";
        // Act
        String result = multiplosPr.FizzBuzzMultiplos(num);
        // Assert
        org.junit.Assert.assertEquals(esperado, result);

}
    @Test
    public void FizzBuzzMultiplos_Fizz_num_Multiplos3 {
        // Arrange
        int num = 3;
        String esperado = "Fizz";
        // Act
        String result = multiplosPr.FizzBuzzMultiplos(num);
        // Assert
        org.junit.Assert.assertEquals(esperado, result);

}
    @Test
    public void FizzBuzzMultiplos_FizzBuzz_num_Multiplos3_5 {
        // Arrange
        int num = 15;
        String esperado = "FizzBuzz";
        // Act
        String result = multiplosPr.FizzBuzzMultiplos(num);
        // Assert
        org.junit.Assert.assertEquals(esperado, result);
}
    @Test
    public void FizzBuzzNoMultiplos_Fizz_num_NoSonMultiplos {
        // Arrange
        int num = 6;
        // Act
        String result = multiplosPr.FizzBuzzMultiplos(num);
        // Assert
        Assert.assertEquals(num, result);
   }
}



