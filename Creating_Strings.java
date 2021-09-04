import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void generatePermutationStrings(int cs, int ts, Map<Character, Integer> map, String ssf){
        if(cs > ts){
            System.out.println(ssf);
            return;
        }
        for(char c : map.keySet()){
            if(map.get(c) > 0){
                map.put(c, map.get(c) - 1);
                generatePermutationStrings(cs+1, ts, map, ssf + c);
                map.put(c, map.get(c) + 1);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        in.close();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int[] fact = new int[9];
        fact[1] = 1;
        for(int i=2; i<9; i++){
            fact[i] = i * fact[i-1];
        }
        int total = fact[s.length()];
        for(Map.Entry entry : map.entrySet()){
            int value = (int) entry.getValue();
            if(value > 1){
                total /= fact[value];
            }
        }
        System.out.println(total);
        generatePermutationStrings(1, s.length(), map, "");
    }
}