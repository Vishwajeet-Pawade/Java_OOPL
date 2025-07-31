import java.util.*;
import java.lang.*;
public class Sum_OE{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
List <Integer> Odd=new ArrayList<>();
List <Integer> Even=new ArrayList<>();

System.out.println("Enter  total numbers :");
int a=sc.nextInt();
int [] arr=new int[a];
int SumE=0,SumO=0;
System.out.println("Enter numbers:");
for(int i=0;i<a;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++){
if (arr[i]%2==0){
Even.add(arr[i]);
SumE+=arr[i];
}
else{
Odd.add(arr[i]);
SumO+=arr[i];
}
}
System.out.println("Even numbers are:"+Even);
System.out.println("Odd numbers are:"+Odd);
System.out.println("Sum of Even numbers = "+SumE+ " and of Odd numbers= "+SumO);
}}