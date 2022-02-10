package com.dxc.javaconcepts.arrays;

public class MultiDimensionalArray {

    public static void main(String[] args){
//creating two matrices
        String[][] a={{"\"Sachin","\"Manish","\"Rohit"},{"\"KL","\"Virat","\"Japrit"},{"\"Shikar","\"Kuldeep","\"Mayank"}};
        String[][] b={{"Tendulkar\"","Pandey\"","Sharma\""},{"Rahul\"","Kohli\"","Bumrah\""},{"Dhawan\"","Yadav\"","Agarwal\""}};


        String[][] c=new String[3][3];


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
