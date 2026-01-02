package Level2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double result1=a+b*c;
        double result2=a*b+c;
        double result3=c+a/b;
        double result4=a%b+c;
        System.out.println("The result of Int Operations are "+result1+","+result2+","+result3+" and "+result4);
    }
}
