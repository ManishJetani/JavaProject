public class PassOrFailAsPerAllSubject
{// This is a programme of input student name, roll no, 3 subject marks and find out if
    // he is pass or fail on the basis of he needs to pass in all the subject
    public static void main(String[] args)
    {
        String name = "Boris Johnson"; // defining a variable
        int rollNo = 10;
        double subject1 = 40;
        double subject2 = 39;
        double subject3 = 50.5;
        if(subject1>=35 && subject2>=35 && subject3>=35) // applying condition
        {
            System.out.println(name + " - Roll no."+ rollNo+ " is Pass");
        }
        else
        {
            System.out.println(name + " - Roll no."+ rollNo+ " is Fail");
        }

    }

}
