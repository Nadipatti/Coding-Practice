import java.util.*;
public class Stringrev{
     static void reverse(String str){
        int length=str.length();
        int count=0;
        for(int i=0;i<=length;i++){
            if(i==length || str.charAt(i)==' '){
                for(int j=i-1;j>=count;j--){
                    System.out.print(str.charAt(j));
                }
                System.out.print(" ");
                count=i+1;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverse(str);
    }
}