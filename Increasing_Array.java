import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        
        long ans = 0;
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1]){
                ans += arr[i-1] - arr[i];
                arr[i] = arr[i-1];
            }
        }
        System.out.println(ans);
        in.close();
    }
}
