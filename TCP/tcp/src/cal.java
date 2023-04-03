import java.util.Scanner;

public class cal {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 (between 10 and 100): ");
        String num1Str = sc.nextLine();
        int num1;
            num1 = Integer.parseInt(num1Str);
            if (num1 < 10 || num1 > 100) 
            {
                System.out.print("Enter Num2 (between -10 and 10): ");
                String num2Str = sc.nextLine();
                int num2;
               
                    num2 = Integer.parseInt(num2Str);
                    if (num2 < -10 || num2 > 10) 
                    {  
                        System.out.print("Enter Operation (+,-,*,/): ");
                        String operation = sc.nextLine();
                        if (!"+-*/".contains(operation) || operation.length() != 1) 
                        {
                        //System.out.println("Error: Bad Operation.");
                        return;
                        }
                    }
                }
                
            } 
        } 