import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder();
        char curr=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==curr){
                count++;
            }
            else{
                result.append(curr).append(count);
                curr=str.charAt(i);
                count=1;
            }
        }
        
        System.out.print(result.append(curr).append(count));
    }
}