package com;



public class patt {
    public static void main(String[] args){

        pattern8(5);

    }

    static void pattern12(int n){
        for (int row= 0; row<= n-1 ; row++)
        {
            for (int s=0; s<row; s++)
            {
                System.out.print(" ");
            }
            for (int col=row; col<=n-1; col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int row= n-1; row>= 0; row--)
        {
            for (int s=0; s<row; s++)
            {
                System.out.print(" ");
            }
            for (int col= row; col<=n-1; col++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
    static void pattern11(int n){
        for (int row = 1; row <=n ; row++) {
            for (int s = 1; s<=row-1 ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int row = 0; row <=n ; row++) {
            for (int s = 0; s<=n-row ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row-1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int row = 1; row <=n ; row++) {
            for (int s =1 ; s<=2*(row)-1 ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*(n-row)+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int row = 1; row <=n ; row++) {
            for (int s = 1; s<=2*(n-row) ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*(row)-1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void pattern7(int n){
        for(int row = 1; row<= n; row++ ){
            for (int s = 2*(row)-1; s>=0  ; s--) {
                System.out.print(" ");
            }
            for(int col = 1; col <= n-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void pattern6(int n){
        for(int row = 1; row<= n; row++ ){

            for (int s = 2*(n-row); s>=0 ; s--) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern5(int n){
        for(int row = 0; row<= 2*n-1; row++ ){
            int toCols = row > n ? 2*n - row : row;
            for(int col = 0; col < toCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void pattern4(int n){
        for(int row = 1; row<= n; row++ ){
            for(int col = 1; col <= row; col++){

                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static  void pattern3(int n){
        for(int row = 1; row<= n; row++ ){
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

      static  void pattern2(int n){
        for(int row = 1; row<= n; row++ ){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void pattern1(int n){
        for(int row = 1; row<= n; row++ ){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
