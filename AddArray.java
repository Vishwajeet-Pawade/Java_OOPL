import java.util.*;
import java.lang.*;
public class AddArray{
public static void main(String args[] ){
Scanner sc= new Scanner(System.in);
int arr[]=new int[5];
ArrayList<Integer> avy=new ArrayList<>(5);
int sum=0;
int s=0;
for(int i=0;i<5;i++){
System.out.printf("Enter %d number:",i+1);
arr[i]=sc.nextInt();
avy.add(arr[i]);
sum+=arr[i];
}
System.out.println("Addition is:"+sum);
for(int i=0;i<5;i++){
   System.out.print(" "+ avy.get(i));
}
}
}



