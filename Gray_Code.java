import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        List<String> ans = recursiveFunction(n);
        for(String s : ans){
            out.println(s);
        }
        in.close();
        out.close();
    }
    private static List<String> recursiveFunction(int n){
        if(n == 1){
            List<String> bcase = new ArrayList<>();
            bcase.add("0");
            bcase.add("1");
            return bcase;
        }
        List<String> rcase = recursiveFunction(n-1);
        List<String> ccase = new ArrayList<>();
        for(int i=0; i<rcase.size(); i++){
            String s = rcase.get(i);
            ccase.add("0"+ s);
        }
        for(int i=rcase.size()-1; i>=0; i--){
            String s = rcase.get(i);
            ccase.add("1"+ s);
        }
        return ccase;
    }
}