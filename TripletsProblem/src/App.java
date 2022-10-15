//Tripltsproblem

// problem using normal array

import java.util.Scanner;
public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void problem(){

            System.out.println("clarity, originality, difficulty");
            // display the results
            // System.out.println(ratings);

            // //compare results
            // for(int i=0;i<ratings.length;i++)
            // {

            // }
            //sample 
            int []a = {1,2,3};
            int[] b = {3,2,1};
            
            int alicePoints = 0;
            int bobsPoints = 0;
            for(int i = 0;i<3;i++)
            {
                if(a[i]>b[i])alicePoints +=1;
                else if(a[i]<b[i])bobsPoints +=1; 
                
            }
            System.out.println("alice points--> "+alicePoints);
            System.out.println("bobsPoints "+bobsPoints);

    }
    public static void main(String[] args) throws Exception {
        problem();
    }
}
