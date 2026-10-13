
import java.util.Scanner;
public class TemperatureConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose conversion: ");
        System.out.println("1. Celsius to Fahrenheit ");
        System.out.println("2. Fahrenheit to Celsius ");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();
        double result = 0;
        if(choice==1)
        {
            result = convertCtoF(temp);
            displayResult(result, "°F");
        }
        else if(choice==2)
        {
            result = convertFtoC(temp);
            displayResult(result, "°C");
        }
        else
        {
            System.out.println("Invalid input");            
        }
        input.close();
    }
    
    public static double convertCtoF(double celsius)
    {
        return (celsius * 9/5) + 32;
    }
    
    public static double convertFtoC(double fahrenheit)
    {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static void displayResult(double result, String unit)
    {
        System.out.println("Result: " + result + unit);    
    }
}
