// -*- Java++ -*-
// bva.java
// $Id: NextDate.java 827 2011-02-07 14:20:53Z medkulk $
// I pledge that I have neither given nor received any help
// on this assignment.
import java.io.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Driver {
    public static void main(String args[]) {
        //option for the user to choose
        //System.out.println("----Please select type of testing:-------- \n" +
          //  "1. Boundary Value Analysis\n" +
          //  "2. Robustness\n" +
          //  "3. Quit");

        //object for number and range of the variables
        //Scanner driver = new Scanner(System.in);

        //defining the input type for the generator
        //int numVar = Integer.parseInt(driver.nextLine());
        //get input for N number of variables
        //System.out.println("--------Please type the number of variables-------\n");

        //defining the input type for range of the variables
      //  int ranVar = Integer.parseInt(driver.nextLine());
        //x filled with size of 100
        //String x[] = new String[200];

        //get input for range of the variables
        //System.out.println("Enter the range of the variables");



      /*  //text file read
        int i = 1;
        String x[] = new String[100];
        try
        {
            //read from outputtest.txt
            File file = new File("outputtest.txt");
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //indicate the first line as input type/number of variables
            int numVar = Integer.parseInt(bufferedReader.readLine());
            //indicate second line/range of the variables
            int ranVar = Integer.parseInt(bufferedReader.readLine());
            String mate;

            while ((mate = bufferedReader.readLine()) != null) {
                x[i] = mate;
                i++;
            }
            fileReader.close();
            if (numVar == 1)
             bva.bva(numVar, ranVar, x);
             //Robustness Testing
         if (numVar == 2)
           robustness.robustness(numVar, ranVar, x);
        }

        catch (IOException z) {
            z.printStackTrace();
        }
        */

        //option for the user to choose
       System.out.println("----Please select type of testing:-------- \n" +
           "1. Boundary Value Analysis\n" +
           "2. Robustness\n" +
           "3. Quit");

       //object for number and range of the variables
       Scanner driver = new Scanner(System.in);

       //defining the input type for the generator
       int numVar = Integer.parseInt(driver.nextLine());
       //get input for N number of variables
       System.out.println("--------Please type the number of variables-------\n");

       //defining the input type for range of the variables
       int ranVar = Integer.parseInt(driver.nextLine());
       //x filled with size of 100
       String x[] = new String[200];

       //get input for range of the variables
       System.out.println("--------Enter the range of the variables-------------\n");



       int i;

       for (i = 1; i <= ranVar; i++) {
           x[i] = driver.nextLine();}
           //Boundary Value Analysis
       if (numVar == 1)
           bva.bva(numVar, ranVar, x);
           //Robustness Testing
       if (numVar == 2)
         robustness.robustness(numVar, ranVar, x);


}



}
