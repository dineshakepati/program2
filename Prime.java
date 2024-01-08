import java.util.*;
class Prime{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int c=0;
for(int i=1;i<=p;i++){
if(p%i==0){
c++;}
}
if(c==2){
System.out.println("it is prime");}
else{
System.out.println("it is not prime");}
}}
