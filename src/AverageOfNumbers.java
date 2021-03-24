public class AverageOfNumbers
{// This is a programme for input any five numbers and find average five numbers
    public static void main(String[] args)
    {// defining variables of numbers
        double number1 = 12;
        double number2 = 15;
        double number3 = 67;
        double number4 = 35;
        double number5 = 42;
        int number = 5;
        double average = ((number1+number2+number3+number4+number5)/number);// calculating average

        System.out.println("Average Number of " + number1+" + "+number2+" + "+number3+" + "+number4+" + "+number5 + " is "+ average);
    }
}
