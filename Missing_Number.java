import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        int ans = 0;
        for(int i=0; i<n-1; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        for(int i : arr){
            ans ^= i;
        }
        for(int i=1; i<=n; i++){
            ans ^= i;
        }
        System.out.println(ans);
        in.close();
    }
}
