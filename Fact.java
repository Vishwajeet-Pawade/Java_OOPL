import java.util.*;

public class Fact{
public  double  Factorial(int data){
if (data==1){
return 1;
}
return data*Factorial(data-1);
}
public double hi(){
double m=Factorial(5);
return m;
}
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
Fact ob=new Fact();
System.out.print("Enter the number:");
int a=sc.nextInt();
double f=1;
for(int i=1;i<=a;i++){
  f=f*i;
}
System.out.println("The factorial of "+a+" is(loop) "+ f);
double fun=ob.Factorial(a);
System.out.println("The factorial of "+a+" is(Recursion) "+ fun);
double j=ob.hi();
System.out.println("The factorial of  5 is(test method) "+ j);
}
}