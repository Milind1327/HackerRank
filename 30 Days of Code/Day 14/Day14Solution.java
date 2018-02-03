import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    private int difference;
    public Difference(int[] elements){
    this.elements=elements;
       // System.out.println(Arrays.toString(elements));
}

void computeDifference(){
    //maximumDifference=0;
    for(int i=0;i<=elements.length-1;i++){
        for(int j=i+1;j<=elements.length-1;j++){
          difference=Math.abs(elements[i])-Math.abs(elements[j]);
       // System.out.println(difference);
        difference=Math.abs(difference);
        if(difference>maximumDifference){
             maximumDifference=difference;
            }  
        }
        
     }
}
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}