public class LeapYear
{ // This is a programme of input any year like 1989 and find out if it is leap year
    // Following method is as per 'if else' method
public static void main(String[] args)
{
    int leapYear = 1989; // defining leapYear variable
    if (leapYear % 4 == 0) // checking leapYear
    {
        System.out.println(leapYear + " is" + " a"+ " Leap Year");
    }else
    {
        System.out.println(leapYear +" is"+" not"+" a"+" Leap Year");
    }

    // Following method is as per 'ternary operator'
//    String msg = (leapYear%4 ==0) ? "It is a Leap Year" : "It is not a Leap Year";
//        System.out.println(msg);
}

}
