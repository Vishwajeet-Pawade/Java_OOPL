import java.util.*;
public class Big_num{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter the  number A:");
a=sc.nextInt();
System.out.println("Enter the  number B:");
b=sc.nextInt();
if(a>b){
System.out.printf("Number A(%d) is larger than B(%d)",a,b);
//System.out.println("Number A is larger than B");
}
else{
System.out.printf("Number B(%d) is larger than A(%d)",b,a);
//System.out.printf("Number B is larger than A");
}
}




}