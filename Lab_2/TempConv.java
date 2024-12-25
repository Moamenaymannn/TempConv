import java.util.function.Function;
import java.util.Scanner;
public class TempConv{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
        Function<Double, Double> celsiusToFahrenheit = celsius -> (celsius * 9 / 5) + 32;

       System.out.println("Enter celsiusTemp");
        double celsiusTemp = in.nextInt(); 
        double fahrenheitTemp = celsiusToFahrenheit.apply(celsiusTemp); 

      
        System.out.println("Temperature in Celsius: " + celsiusTemp);
        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemp);
    }
}

