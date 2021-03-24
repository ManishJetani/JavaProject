public class PassOrFailAsPerPercentage
{ // This is a programme of Student name, roll no, 3 subject marks and find out total, percentage and result if
    //she is pass or fail on basis of percentage and also give them grade
    public static void main(String[] args)
    {
    String name = "Theresa May"; // defining a variable
    int rollNo = 10;
    double subject1 = 80.5;
    double subject2 = 72.5;
    double subject3 = 39;
    double total = (subject1+subject2+subject3);
    double percentage = (total/3);
        System.out.println(name + " - Roll No."+ rollNo);
        System.out.println("Total Marks = "+ total);
        System.out.println("Percentage = " + percentage +"%");
   // applying condition of pass or fail
    if(percentage>=80 && subject1>=35 && subject2>=35 && subject3>=35)
        {
            System.out.println("Pass with Grade A+");
        }
    else if(percentage>=60 && percentage<80 && subject1>=35 && subject2>=35 && subject3>=35)
    {
        System.out.println("Pass with Grade A");
    }
    else if(percentage>=50 && percentage<60 && subject1>=35 && subject2>=35 && subject3>=35)
    {
        System.out.println("Pass with Grade B");
    }
    else if(percentage>=35 && percentage<50 && subject1>=35 && subject2>=35 && subject3>=35)
    {
        System.out.println("Pass with Grade C");
    }
    else
     {
        System.out.println("Fail");
    }

    }








}
