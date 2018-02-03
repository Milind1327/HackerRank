import java.util.*;
import java.io.*;

//Write your code here

class Calculator{
    
    public int power(int x, int y) throws Exception{
           if(x<0 || y<0){
               throw new Exception("n and p should be non-negative");
           }
        
        if(x==0){
            return 0;
        } 
        else if(y==0){
            return 1;  
        } else if(y==1){
            return x*y;
        }
        int mult;
        mult=x;
        for(int i=0;i<y-1;i++){
            mult=mult*x;
        }
        return mult;
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
