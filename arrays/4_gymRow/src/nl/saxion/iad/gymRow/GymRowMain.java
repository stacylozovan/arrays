package nl.saxion.iad.gymRow;

import nl.saxion.app.SaxionApp;

public class GymRowMain implements Runnable{

    public void run(){
        int[] childrenLength = {120, 115, 140, 110, 105, 90, 104, 128, 125, 130};


        SaxionApp.printLine("Expected: 90, 104, 105, 110, 115, 120, 125, 128, 130, 140");
        int[] sortedArray = sort(childrenLength);
        SaxionApp.printLine("Actual  : " + printArray(sortedArray));

    }



    private int[] sort(int[] array){
        //TODO: implement a algorithm that sort the input from lowest to highest

        return array;
    }





    
    private String printArray(int[] array){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if(i != array.length-1){ //if not the last element, add a ","
                result+=", ";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        SaxionApp.start(new GymRowMain(), 1024, 768);
    }
}
