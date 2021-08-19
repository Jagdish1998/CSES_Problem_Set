import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        if(n == 1){
            System.out.println("1");
            return;
        }
        if(n <= 3){
            System.out.println("NO SOLUTION");
            return;
        }
        if(n == 4){
            System.out.println("2 4 1 3");
            return;
        }
        boolean flag = false;
        if((n&1) == 0) flag = true;
        if(flag){
            for(int i=n; i>=2; i-=2){
                out.print(i + " ");
            }
            for(int i=n-1; i>=3; i-=2){
                out.print(i + " ");
            }
            out.print("1");
        }else{
            for(int i=n-1; i>=2; i-=2){
                out.print(i + " ");
            }
            for(int i=n; i>=3; i-=2){
                out.print(i + " ");
            }
            out.print("1");
        }
        
        in.close();
        out.close();
    }
}