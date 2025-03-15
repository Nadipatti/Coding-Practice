import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean pair=false;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    result.add(i);
                    result.add(j);
                    pair=true;
                    break;
                }
            }
            if(pair){
                break;
            }
        }
        System.out.print(result.toString());
    }
}
