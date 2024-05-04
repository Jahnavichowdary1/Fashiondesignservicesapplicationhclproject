 import java.util.*;
    // public class recursion{
    //     public static void printSum(int n,int sum){
    //         if(n==0){
    //             System.out.println(sum);
    //             return;
    //         }
    //         sum=sum+n;
    //         printSum(n-1,sum);
   
    //     }
    //     public static void main(String args[]){
    //         printSum(5,0);
    //     }
    // }
// FIND THE LARGEST
public class Largest{
    public static void main(String args[]){
        System.out.println("Enter three number");
        Scanner in=new Scanner(System.in);
        int a=in.next();
        Scanner in=new Scanner(System.in);
        int b=in.next();
        Scanner in=new Scanner(System.in);
        int c=in.next();
        if(a>b||a>c){
            System.out.println("Max is"a);
        }
        if(b>a||b>c){
            System.out.println("Max is"b);
        }
        if(c>a||c>b){
            System.out.println("Max is"c);
        }

    }
}
