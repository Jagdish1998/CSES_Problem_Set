import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    public static void main(String[] args) throws Exception{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            String[] s = in.readLine().trim().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            if((2*a-b) >= 0 && (2*b-a) >= 0 && (2*a-b)%3 == 0 && (2*b-a)%3 == 0){
                out.println("YES");
            }else out.println("NO");
        }
        in.close();
        out.close();
    }
}