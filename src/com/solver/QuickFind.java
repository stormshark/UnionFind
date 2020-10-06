package com.solver;
import java.util.Scanner;

public class QuickFind {
    Scanner reader =new Scanner(System.in);
    public int[] unionFindArray ;

    public QuickFind(int sizeofArray) {

        unionFindArray = new int[sizeofArray];
        System.out.println("Please enter elements of array");
        int i = 0;
        while (i < sizeofArray) {
            System.out.println(i + 1 + " .th element");
            unionFindArray[i] = reader.nextInt();
            i++;
        }

    }
// 0 ,1
    public boolean connectionControl (int firstElement, int secondElement) {
        return unionFindArray[firstElement] == unionFindArray[secondElement];
    }

    public void connect(int firstElement, int secondElement){
        unionFindArray [firstElement]=unionFindArray[secondElement];

        // first elemente eşit olan tüm değerleri tara ve onları da second element yap
        for (int i=0 ;i<unionFindArray.length ; i++) {
            if (unionFindArray[i]==firstElement) {
                unionFindArray[i]=secondElement;
            }
        }
    }

}