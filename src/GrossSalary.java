public class GrossSalary
{// This is a programme of input employee id, name, basic salary then find HRA,TA,DA,PF and Gross Salary
    public static void main(String[] args)
    {
    int employeeId = 1010; // defining a variable
    String name = "Mr.Rishi Sunak"; // defining a variable
    int basicSalary = 25000; // defining a variable
    double hRA = (basicSalary*10/100); // calculation of hRA
    double dA = (basicSalary*8/100); // calculation of dA
    double tA = (basicSalary*9/100); // calculation of tA
    double pF = (basicSalary*20/100); // calculation of pF
    double grossSalary = (basicSalary+hRA+dA+tA-pF); // calculation of grossSalary
        System.out.println(name + " (Employee ID " +employeeId + ") receives following perks");
        System.out.println("HRA £"+ hRA);
        System.out.println("DA  £"+ dA);
        System.out.println("TA  £"+ tA);
        System.out.println("PF -£"+ pF);
        System.out.println("Gross Salary of £"+ grossSalary);

    }
}
