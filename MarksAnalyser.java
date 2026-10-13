import java.util.Scanner;

public class MarksAnalyser
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int limit = input.nextInt();

        int[] marks = new int[limit];
        int total = 0;

        // Read marks and build total
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter mark #" + (i + 1) + ": ");
            int mark = input.nextInt();
            marks[i] = mark;
            total += mark;
        }

        // Highest & lowest
        int highestMark = marks[0];
        int lowestMark = marks[0];

        for (int i = 1; i < limit; i++) {
            if (marks[i] > highestMark) {
                highestMark = marks[i];
            }
            if (marks[i] < lowestMark) {
                lowestMark = marks[i];
            }
        }

        double average = (double) total / limit;

        System.out.println();
        System.out.println("Highest mark: " + highestMark);
        System.out.println("Lowest mark: " + lowestMark);
        System.out.println("Average mark: " + average);

        input.close();
    }
}

