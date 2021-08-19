import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    public static void main(String[] args) throws Exception{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int ans = 0;
        for(int i=5; i<=n; i*=5){
            ans += n/i;
        }
        System.out.println(ans);
        in.close();
    }
}