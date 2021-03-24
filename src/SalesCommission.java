public class SalesCommission
{// This is a programme of input sales id, seller's name, sales amount, salary basic and then find sales commission
    public static void main(String[] args)
    { // defining a variable
    int salesId = 2342;
    String sellerName = "Mr. Dominic Raab";
    double salesAmount = 25000;
    double basicSalary = 40000;
    double salesCommission1 = salesAmount*35/100; // commission at 35%
    double salesCommission2 = salesAmount*20/100; // commission at 20%
    double salesCommission3 = salesAmount*10/100; // commission at 10%
    double salesCommission4 = salesAmount*5/100; // commission at 5%
    double salesCommission = salesAmount*2/100; // commission at 2%
        System.out.println("Name: " + sellerName );
        System.out.println("Sales ID: "+ salesId );
        System.out.println("Basic Salary:     £"+ basicSalary);
        // applying condition as per following block
    if(salesAmount>=50000)
    { System.out.println("Sales Commission:  £" + salesCommission1);
        System.out.println("Total Income:     £"+(basicSalary+salesCommission1));
    }
    else if(salesAmount>=30000 && salesAmount<50000)
    { System.out.println("Sales Commission:  £"+ salesCommission2);
        System.out.println("Total Income:     £" + (basicSalary+salesCommission2));
    }
    else if(salesAmount>=20000 && salesAmount<30000)
    { System.out.println("Sales Commission:  £"+ salesCommission3);
        System.out.println("Total Income:     £"+ (basicSalary+salesCommission3));
    }
    else if(salesAmount>=10000 && salesAmount<20000)
    { System.out.println("Sales Commission:  £"+ salesCommission4);
        System.out.println("Total Income:     £"+ (basicSalary+salesCommission4));
    }
    else
        { System.out.println("Sales Commission:  £"+ salesCommission);
            System.out.println("Total Income:     £"+ (basicSalary+salesCommission));
        }
    }
}
