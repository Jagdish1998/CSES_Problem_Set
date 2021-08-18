import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        if(s.length() == 1){
            System.out.println("1");
            return;
        }
        int maxCount = Integer.MIN_VALUE;
        int currCount = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)) currCount++;
            else currCount = 1;
            if(currCount > maxCount) maxCount = currCount;
        }
        System.out.println(maxCount);
        in.close();
    }
}
