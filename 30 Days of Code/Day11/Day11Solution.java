import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int newArr[]=new int[40];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int row=arr.length;
        int col=arr[0].length;
        int max=-100;
        int currentMax=0;
        //System.out.println(+row+","+col);
        //System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<row-2;i++){
            for(int j=0;j<col-2;j++){
               currentMax=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                    arr[i+1][j+1]+
                    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(currentMax>max){
                    max=currentMax;
                }
                }
        }
        
                    System.out.println(max);
            
        
    }
}
