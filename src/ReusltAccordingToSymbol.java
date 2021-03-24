public class ReusltAccordingToSymbol
{ // This is a programme of input any two number and ask user to enter their symbol (+,-,/,*) find addition,
    // subtraction, multiplication and division according to their symbol
    public static void main(String[] args)
    {
        double a=15; // defining a variable
        double b=25;
        char symbol='+';

        if(symbol=='-') // applying a condition
        {
            System.out.println(a+" - "+b+ " = "+ (a-b) + " So it is subtraction symbol");
        }
        else if(symbol=='+')
        {
            System.out.println( a +" + "+ b +" = " +(a+b)+ " So it is addition symbol");
        }
        else if(symbol=='*')
        {
            System.out.println(a+ " * "+ b + " = "+ (a*b) + " So it is multiplication symbol");
        }else
        {
            System.out.println(a+ "/"+b+ " = "+ (a/b) + " So it is division symbol");
        }

      }
}
