import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        in.close();
        long ans = Long.MIN_VALUE;
        long curr = 0;
        for(int i=0; i<n; i++){
            curr += arr[i];
            if(curr > ans) ans = curr;
            if(curr < 0) curr = 0;
        }
        System.out.println(ans);
    }
}