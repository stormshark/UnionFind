package com.solver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter size of array ");
        Scanner reader =new Scanner(System.in);
        int size=reader.nextInt();
        QuickFind quickFind=new QuickFind(size);
        quickFind.connect(4,3);
        quickFind.connect(3,8);
     //   quickFind.connect(3,8);


    }


}
