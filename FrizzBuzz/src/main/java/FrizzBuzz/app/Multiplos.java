package FrizzBuzz.app;


public class Multiplos {
    public Multiplos(){}
    public String FizzBuzzMultiplos(int num) {
        String var = "No es Multiplo";

        if (num % 3 == 0 && num % 5 == 0) {
            var = "FizzBuzz";
        }
        if (num % 3 == 0) {
            var = "Fizz";
        }
        if (num % 5 == 0) {
            var = "Buzz";
        }
        return var;
    }
    public int FizzBuzzNoMultiplos(int num){
        return num;
    }
}
