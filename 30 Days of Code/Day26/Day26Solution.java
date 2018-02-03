import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        int maxD=scan.nextInt();
        int maxM=scan.nextInt();
        int maxY=scan.nextInt();
        
        int minD=scan.nextInt();
        int minM=scan.nextInt();
        int minY=scan.nextInt();
        int fine=0;
        int diff=0;
        
        if(minD == maxD && minM==maxM && minY==maxY){
           fine=0; 
        } else if(minM==maxM && minY==maxY){
            diff=maxD-minD;
            fine=15*diff;
        } else if(minY==maxY && minM!=maxM ){
            diff=maxM-minM;
            if(diff>0)
            fine=500*diff;
            else
            fine=0;
        } else if(maxY-minY>=1){
            fine=10000;
        }
        
       System.out.println(fine);
        
        
    }
}