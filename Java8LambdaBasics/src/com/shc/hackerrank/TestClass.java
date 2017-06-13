package com.shc.hackerrank;

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
*/
        //BufferedReader
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        int count = 0;

        for (int i = 1; i < N1; i++) {
           // for( i = 1 ; i < N2 ; i++){
               if((N1%i == 0) && (N2%i == 0)){
                    count++;
             // }
           }
        }

        System.out.println(count);
    }
}
