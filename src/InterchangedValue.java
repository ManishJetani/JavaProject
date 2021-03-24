public class InterchangedValue
{// This is a programme of input any two numbers and then print their interchanged value
    public static void main(String[] args) {
        int a = 12; // defining variable
        int b = 21; // defining variable
       {
            System.out.println("Before Interchanged" +" a=" + a+ " and" +" b="+ b);
        }
        // defining values after interchanged
        a=a+b;// a=12+21   means a=33
        b=a-b;// b=33-21   means b=12
        a=a-b;// a=33-12   means a=21
        {
            System.out.println("After Interchanged"+ " a="+a+" and"+ " b="+ b);
        }

    }

}
