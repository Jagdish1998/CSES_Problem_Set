import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        long n = Long.parseLong(in.readLine());
        in.close();
        long sum = (n*(n+1))/2;
        if((sum&1) != 0){
            System.out.println("NO");
            return;
        }
        Set<Long> set1 = new HashSet<>();
        Set<Long> set2 = new HashSet<>();
        sum /= 2;
        while(n>0){
            if(sum-n >= 0){
                set1.add(n);
                sum -= n;
            }else{
                set2.add(n);
            }
            n--;
        }
        out.println("YES");
        out.println(set1.size());
        for(long i : set1){
            out.print(i+" ");
        }
        out.println();
        out.println(set2.size());
        for(long i : set2){
            out.print(i+" ");
        }
        out.close();
    }
}