public class OddEvenNumber
{
// This is a programme of input any two number and find out odd or even number using ternary operator
    public static void main(String[] args) {
        int a = 10; // defining a variable
        double b = 2; // defining a variable
        double total = (a + b); // defining a variable
        String msg = (total%2==0) ? (total +" is an Even Number") : (total + " is an Odd Number"); // using ternary operator
        System.out.println(msg);

        //following is as per 'if else' method :
//        if (total % 2 == 0) {
//            System.out.println(total +" is an Even number");
//        } else {
//            System.out.println(total + " is an Odd number");
//        }
    }

}
