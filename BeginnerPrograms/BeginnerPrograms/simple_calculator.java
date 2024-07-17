package BeginnerPrograms;

import java.util.Scanner;

class Calculator{
    public static void add(int a , int b){
        System.out.println("Addition :"+(a+b));
    }
    static void sub(int a , int b){
        System.out.println("Subtraction :"+(a-b));
    }
    static void mul(int a , int b){
        System.out.println("Multiplication :"+(a*b));
    }
    static void div(int a , int b) {
        if(b==0){
            System.out.println("Division by zero is not possible");
        }else{
            System.out.println("Division :"+(a/b));
        }
    }
}

public class simple_calculator {
     public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("-------------------------");
            System.out.println("enter the value of a");
            int a = sc.nextInt();
            System.out.println("enter the value of b");
            int b = sc.nextInt();
            System.out.println("-------------------------");
            System.out.println("Arithmetic Operation to Perform");
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.All 6.Exit");
            System.out.println("-------------------------");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    Calculator.add(a,b);
                    break;
                case 2 :
                    Calculator.sub(a,b);
                    break;
                case 3 :
                    Calculator.mul(a,b);
                    break;
                case 4:
                    Calculator.div(a,b);
                    break;
                case 5:
                    Calculator.add(a,b);
                    Calculator.sub(a,b);
                    Calculator.mul(a,b);
                    Calculator.div(a,b);
                    break;
                case 6 :
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
