package nl.saxion.iad.arrayComparing;

import nl.saxion.app.SaxionApp;

public class ArrayComparingMain implements Runnable{
    public void run(){
        SaxionApp.printLine("Expected: true");
        SaxionApp.printLine("Actual: " + compareArrays(new int[]{1,4,5,6}, new int[]{1,4,5,6}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: false");
        SaxionApp.printLine("Actual: " + compareArrays(new int[]{1,5,5,6}, new int[]{1,4,5,6}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: true");
        SaxionApp.printLine("Actual: " + compareArrays(new int[]{1}, new int[]{1}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: false");
        SaxionApp.printLine("Actual: " + compareArrays(new int[]{1,3,5}, new int[]{1}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: false");
        SaxionApp.printLine("Actual: " + compareArrays(new int[]{1}, new int[]{1,4,7}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: true");
        SaxionApp.printLine("Actual: " + compareArrays(new int[0], new int[0]));


        SaxionApp.printLine("======= Extra challenge =========");
        SaxionApp.printLine("Expected: true");
        SaxionApp.printLine("Actual: " + compareArrays2(new int[]{1,3,5}, new int[]{1,3,5}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: false");
        SaxionApp.printLine("Actual: " + compareArrays2(new int[]{1,3,5}, new int[]{1,3,5,8}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: true");
        SaxionApp.printLine("Actual: " + compareArrays2(new int[]{1,3,5}, new int[]{3,1,5}));
        SaxionApp.printLine();
        SaxionApp.printLine("Expected: false");
        SaxionApp.printLine("Actual: " + compareArrays2(new int[]{1,3,5,7}, new int[]{3,1,5}));
    }





    public boolean compareArrays(int[] array1, int[] array2){
        //TODO: implement

        return true;
    }




    public boolean compareArrays2(int[] array1, int[] array2){
        //TODO: implement

        return true;
    }

    public static void main(String[] args) {
        SaxionApp.start(new ArrayComparingMain(), 1024, 768);
    }
}
