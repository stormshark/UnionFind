package com.solver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Please Enter size of array ");
//        Scanner reader =new Scanner(System.in);
//        int size=reader.nextInt();
        QuickFind quickFind=new QuickFind(10);
        quickFind.connect(4,3);
        quickFind.connect(3,8);
        quickFind.connect(6,5);
        quickFind.connect(9,4);
        quickFind.connect(2,1);
        quickFind.connect(8,9);


        quickFind.connect(5,0);
        quickFind.connect(7,2);
        quickFind.connect(6,1);

    }


}
