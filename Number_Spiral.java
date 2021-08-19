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
            long row = Long.parseLong(s[0]);
            long col = Long.parseLong(s[1]);
            long ans = 0;
            if(row < col){
                if(col%2 != 0){
                    ans = (col*col) - row + 1;
                }else ans = (col-1)*(col-1) + row;
            }else if(row > col){
                if(row%2 != 0){
                    ans = (row-1)*(row-1) + col;
                }else{
                    ans = (row*row) - col + 1;
                }
            }else {
            	ans = (row * row) - (col - 1);
            }
            out.println(ans);
        }
        in.close();
        out.close();
    }
}