import java.util.Scanner;
public class Part2 {
    
    public static void main(String[] args)
    {
    final int ARRAY_SIZE = 2;
    int [] numbers =new int[ARRAY_SIZE];
    getValues(numbers);
    int total = 0; 
        for (int index = 0; index < numbers.length; index++)
        {
            total += numbers[index];
        }
    }
       private static void getValues(int[] array)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a series of " +array.length+ " numbers.");

                for (int index=0; index<array.length; index++)
                {
                    System.out.print("Enter number " + (index + 1) + ": ");
                    array[index] = keyboard.nextInt();
                }
        }

}
