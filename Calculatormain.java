import java.util.Scanner;

public class Calculatormain {
	public static void main(String[] args) {
 Scanner userinput=new Scanner(System.in);
   System.out.println("enter 2 numbers");
   double  num1=userinput.nextInt();
   int num2=userinput.nextInt();
   System.out.println("1for addition  2for substraction 3 for mutlipication 4 for divison");
   int choice= userinput.nextInt();
  Calculation object=new Calculation();
  
  
   switch(choice) {
   case 1:double addition =object.addition(num1, num2);
   System.out.println("result:"+addition);
   break;
   case 2:double sub =object.sub(num1, num2);
   System.out.println("result:"+sub);
   break;
   case 3:double multiplication =object.mult(num1, num2);
   System.out.println("result:"+multiplication);
   break;
   case 4:double div =object.div(num1, num2);
   System.out.println("result:"+div);
   break;
	   
   }
   }
	}

