import java.util.*;
public class Passwordcheck{
    static boolean isverify(String str){
        boolean digit=false;
        boolean upper=false;
        boolean lower=false;
        boolean special=false;
        if(str.length()<=8){
            System.out.print("invalid");
            return false;
        }
        for(int i=0;i<str.length()-1;i++){
        char ch=str.charAt(i);
        if(Character.isDigit(ch)){
             digit=true;
        }
        else if(Character.isUpperCase(ch)){
             upper=true;
        }
        else if(Character.isLowerCase(ch)){
             lower=true;
        }
        else if(!Character.isLetterOrDigit(ch)){
            special=true;
        }
    }
    return digit && upper && lower && special;
    }    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String result=sc.nextLine();
        if(isverify(result)){
            System.out.print("valid");
        }
        else{
            System.out.print("not valid");
        }
    }
    
}
