import java.util.Scanner;

class CelsiusToFahrenheit3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);1

        
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        
        double fahrenheit = (celsius * 9 / 5) + 32;

        
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        
    }
}
