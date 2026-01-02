package Level1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        float num1,num2;
        Scanner input = new Scanner(System.in);
        num1=input.nextFloat();
        num2=input.nextFloat();
        float resultAdd = num1+num2;
        float result1Sub2 = num1-num2;
        float result2Sub1 = num2-num1;
        float resultMult = num1*num2;
        float result1Div2 = num1/num2;
        float result2Div1 = num2/num1;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+
                resultAdd+" and "+ result1Sub2 +" is "+result2Sub1+","+resultMult+","+result1Div2+", and "
                +result2Div1);
    }
}
