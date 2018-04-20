import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findDevisor {
    boolean coprime;

    public static List<Integer> printDivisors(int n)
    {
        List<Integer> listOfDivisors= new ArrayList<>();
        int maxD = (int)Math.sqrt(n);
        for (int i=1; i<=maxD; i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    listOfDivisors.add(i);

                    // Otherwise print both
                else
                {
                    listOfDivisors.add(i);
                    listOfDivisors.add(n/i);
                }
            }
        }
        return listOfDivisors;
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        // Take first number as input from user
        System.out.println("Please enter the first number greater than zero:");
        int num1= sc.nextInt();
        // Take second number as input from user
        System.out.println("Please enter the second number greater than zero and not equal to num1:");
        int num2= sc.nextInt();
        // Find divisors of first number
        System.out.println("The divisors of "+num1+" are: ");
        List<Integer> l1 = printDivisors(num1);
        System.out.println(l1);
        // Find divisors of second number
        System.out.println("The divisors of "+num2+" are: ");
        List<Integer> l2 = printDivisors(num2);
        System.out.println(l2);

        // Finding common elements in both the lists
        l1.retainAll(l2);

        // Verifying if numbers are coprime
        if(l1.size()==1 && l1.get(0)==1)
        {
            System.out.println(num1+" and "+num2+" are coprimes.");
        }
        else
        System.out.println(num1+" and "+num2+" are not coprimes.");
    }

    public void findE() {

    }

}



