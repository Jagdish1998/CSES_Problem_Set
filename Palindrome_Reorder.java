import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = in.readLine();
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : arr){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i=0, j=arr.length-1, oddCount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if((int)entry.getValue()%2==0){
                int val = (int)entry.getValue()/2;
                while(val-->0){
                    arr[i++] = entry.getKey();
                    arr[j--] = entry.getKey();
                }
            }else{
                oddCount++;
                int val = (int)entry.getValue()/2;
                while(val-->0){
                    arr[i++] = entry.getKey();
                    arr[j--] = entry.getKey();
                }
                arr[arr.length/2] = entry.getKey();
            }
        }
        if(oddCount > 1){
            System.out.println("NO SOLUTION");
            return;
        }
        for(char c : arr){
            out.print(c);
        }
        
        in.close();
        out.close();
    }
}