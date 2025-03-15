import java.util.*;
public class Occurance{
    static int maximum(int arr[],int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=2;i<n;i++){
            if(n%i==0){
                result.add(i);
            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        int max=maximum(arr,n);
        int[] b=new int[max+1];
        for(int i=0;i<max+1;i++){
            b[i]=0;
        }
        for(int i=0;i<n;i++){
            int k=arr[i];
            b[k]++;
        }
        for(int i=0;i<n;i++){
            int k=arr[i];
            while(b[k]!=0){
                System.out.println(k+"->"+b[k]);
                b[k]=0;
            }
        }
    }
}
