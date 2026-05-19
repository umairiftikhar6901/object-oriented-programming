import java.util.*;
class Myclass{
    public static void main (String args[]){
        int num1;
        int num2;
        int result;
        char op;
        System.out.println("Plese enter the num1 operator and num2");
        Scanner input=new Scanner(System.in);
        num1=input.nextInt();
        num2=input.nextInt();
        op=input.next().Char.At(0);
        if(op == '+'){
            result=num1+num2;
        }
        else if(op == '-'){
            result=num1-num2;
        }
        else if(op == '*'){
            result=num1*num2;
        }
        else if(op == '/'){
            result=num1/num2;
        }
        else if(op == '%'){
            result=num1%num2;
        }
        else{
            System.out.println("Invalid Operator");
        }
        System.out.println("result"+result);
    }
}