package com.company;

//Given 3 int values, a b c, return their sum.
// However, if one of the values is the same as another of the values, it does not count towards the sum.
//will use if else statement
//sum (1,2,3) -> 6
//sum(3,2,3) -> 2
//sum (3,3,3) -> 0
public class Int_12 {
    public static void main(String[] args) {
    }

        public static int value ( int a, int b, int c) {

             int i = 0;
             int j = 2;
             int k = 3;

            if (i == j || j == k || k == i) return 0;

            else{
                if (i == j) return k;
                if (j == k) return i;
                if (k == i) return j;

                else return i + j + k;
            }
        }

    }
