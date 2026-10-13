import java.util.Scanner;
public class MiniCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.println("Choose operation:");
        System.out.println("1. Add ");
        System.out.println("2. Substract ");
        System.out.println("3. Multiply ");
        System.out.println("4. Divide ");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        switch(choice)
        {
            case 1:
                add(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                divide(num1, num2);
                break;
        }
        
        input.close();
    }
    
    public static void add(double num1, double num2)
    {
        System.out.println("Result: " + (num1+num2));        
    }
    
    public static void subtract(double num1, double num2)
    {
        System.out.println("Result: " + (num1-num2));        
    }
    
    public static void multiply(double num1, double num2)
    {
        System.out.println("Result: " + (num1*num2));        
    }
    
    public static void divide(double num1, double num2)
    {
        if (num2 == 0)
        {
            System.out.println("Error: Cannot divide by zero.");
        }
            else
            {
                System.out.println("Result: " + (num1/num2));    
            }
    }
}
