import java.util.*;
public class UseHash {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] str=sc.nextLine().trim().split("\\s+");
        int n=str.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        Map<Integer, Integer> result = new HashMap<>();
        for (int num : arr) {
            result.put(num, result.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = Integer.MIN_VALUE;
        int maxNumber = -1;  
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxNumber = entry.getKey();
            }
        }
        System.out.println( maxNumber);
       // System.out.println( maxFrequency);
    }
}

