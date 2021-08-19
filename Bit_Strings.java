import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    public static void main(String[] args) throws Exception{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = (ans * 2)%1000000007;
        }
        System.out.println(ans);
        in.close();
    }
}