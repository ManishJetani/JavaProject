public class DayNameOfTheWeek
{ // This is a programme of input any number then print day name of the week accordingly
    public static void main(String[] args)
    {
        int day = 8; // defining variable
        // applying condition
        if(day==1)
        {
            System.out.println("Day " + day +" is Monday");
        }
        else if (day==2)
        {
            System.out.println("Day "+ day + " is Tuesday");
        }
        else if (day==3)
        {
            System.out.println("Day "+ day + " is Wednesday");
        }
        else if (day==4)
        {
            System.out.println("Day "+ day + " is Thursday");
        }
        else if (day==5)
        {
            System.out.println("Day "+ day + " is Friday");
        }
        else if (day==6)
        {
            System.out.println("Day "+ day + " is Saturday");
        }
        else if (day==7)
        {
            System.out.println("Day "+ day + " is Sunday");
        }
        else
        {
            System.out.println("Invalid Entry = Number range should be between 1 to 7");
        }

    }
}
