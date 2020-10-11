package com.solver;

public class QuickUnion {

    int sizeofarray;
    int[] array;

    public QuickUnion(int sizeofarray) {
        array= new int[sizeofarray];
    }

    public QuickUnion() {
        array= new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }


    public void connect (int firstIndexValue, int secondIndexValue) {
        array[firstIndexValue]=rootValueofArray(secondIndexValue);
        // ilk değerinin indeksine ikinci değerin rootuna ata
    }

    public boolean connectionControl(int firstValue, int secondValue){
        return rootValueofArray(firstValue)==rootValueofArray(secondValue);
    }

    public int rootValueofArray (int arrayindex){
        while (arrayindex!=array[arrayindex])  arrayindex=array[arrayindex];
        return arrayindex;
    }



}
