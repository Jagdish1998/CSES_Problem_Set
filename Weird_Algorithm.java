import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        long n = Integer.parseInt(in.readLine());
        out.print(n + " ");
        while(true){
            if(n == 1) break;
            if((n&1) != 0){
                n = n*3 + 1;
                out.print(n + " ");
            }else{
                n = n>>1;
                out.print(n + " ");
            }
        }
        in.close();
        out.close();
    }
}
