import java.util.*;
public class Bina{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int index=0;
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=l+h/2;
            if(arr[mid]==k){
                index=mid;
                break;
            }
            else if(arr[mid]<k){
                l=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        System.out.print(index);
        
    }
}
