// -*- Java++ -*-
// bva.java
// $Id: NextDate.java 827 2011-02-07 14:20:53Z medkulk $
// I pledge that I have neither given nor received any help
// on this assignment.
public class bva {
    public static void bva(int bValT, int bValV, String[] x) {

        //initializes integers, for comparison start and end range
        int a[] = new int[100]; //initializes b to 100
        int b[] = new int[100]; //initializes c to 100
        int d[] = new int[200]; //initializes a to 200

        int m = 1;
        int i = 1;


        for (i = 1; i <= bValV; i++) {

          //starting range, check the start of the range (1)
            //System.out.print("---Check start of the range-----");
            if (x[i].startsWith("(")) {
                b[i] = 1;
            } //end if
            else
                b[i] = 0; //end else
            //ending range
            //check the end of the range (1)
            //System.out.print("-------Check end of the range------");
            if (x[i].endsWith(")")) {
                d[i] = 1;
            } //end if
            else
                d[i] = 0;


            x[i] = x[i].replaceAll("[()]", "").replace("[", "").replace(" ", "").replace("]", "");

            //split the range, divide into ordered
            //System.out.print("-------Split------");
            String[] bVale = x[i].split(",");

            for (String j : bVale) {
                //define type for a
                a[m] = Integer.parseInt(j);
                m++;
            } //end else
        }


        int p = m;
        //initialize upper range
        int uppera[] = new int[200];
        //initialize lower range
        int lowera[] = new int[200];
        //initalize the range
        int ranVar[][] = new int[200][20];

        i = 1;


        //for loop
        for (m = 1; m < p; m = m + 2) {
            if (b[i] == 1)
            //min+
                lowera[i] = a[m] + 1; //end if
            else
            //min
                lowera[i] = a[m]; //end else

            if (d[i] == 1)
            //max
                uppera[i] = a[m + 1] - 1; //end if
                //max-
            else

                uppera[i] = a[m + 1]; //end else

            i++;
        } //end for loop
        for (i = 1; i <= bValV; i++) {
            //min
            ranVar[i][0] = lowera[i];
            //min+
            ranVar[i][1] = lowera[i] + 1;
            //max-
            ranVar[i][2] = uppera[i] - 1;
            //max
            ranVar[i][3] = uppera[i];
        }
        //nominal value
        int nominal[] = new int[100];
        //nom
        for (i = 1; i <= bValV; i++) {
            nominal[i] = (lowera[i] + uppera[i]) / 2;
        }


        System.out.println("-------------BVA Inputs--------------------:");
        //printing the nominal values of the range
        //for (int h = 1; h <= bValV; h++) {
          //print the nominal
            //System.out.print(nominal[h] + " \t");
        //}

        //print the values
            //System.out.println("-------------Min, Min+, Max-, Max BVA Inputs--------------------:");


        for (i = 1; i <= bValV; i++) {
          //min, min+, max-, max
            for (int j = 0; j < 4; j++) {
                for (m = 0; m < i; m++) {
                    if (m > 0) {
                        System.out.print(nominal[m] + "\t");
                    }
                }
                System.out.print(ranVar[i][j] + " \t");

                //nominal
                for (int h = i + 1; h <= bValV; h++) {
                    System.out.print(nominal[h] + " \t");
                } //end for

                System.out.print("\n");

            }
        }
        for (int h = 1; h <= bValV; h++) {
          //print the nominal
            System.out.print(nominal[h] + " \t");
        }
    }
}
