import java.util.Scanner;
public class GuessTheNumber
{
    public static void main()
    {
        int randNum = (int)(Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);
        int num = 0;
        int attempts = 0;
        System.out.println("I have chosen a number between 1 and 100.");
        while(num!=randNum)
        {
            System.out.print("Enter your guess: ");
            num = input.nextInt();
            if(num>randNum)
            {
                System.out.println("Too high! Try again.");    
            }
                else if(num<randNum)
                {
                    System.out.println("Too low! Try again.");
                }
            attempts++;
        }
        System.out.println("Correct! You guessed it in " + attempts + " attempts.");
        input.close();
    }
}
