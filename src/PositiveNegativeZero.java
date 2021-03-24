public class PositiveNegativeZero
{//This is a programme of input any number and find out if is positive, negative or zero
    public static void main(String[] args)
    {
        long value = 3245; // defining a variable, I could use 'int' as well but I choose long number range
        if (value > 0) // applying condition
        {
            System.out.println("Entered number " + value + " is Positive");
        }
         else if (value < 0)
        {
            System.out.println("Entered number " + value + " is Negative");
        } else
            {
            System.out.println("Entered number is " + value);
        }
    }

}
