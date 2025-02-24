import nl.saxion.app.SaxionApp;

public class EliminationMain implements Runnable{

    public void run(){
        int[] array1 = {1,3,5,5,7,8,8,9};
        int[] array1AfterElimination = eliminateDuplicates(array1);
        SaxionApp.printLine("Expected: 1, 3, 5, 7, 8, 9");
        SaxionApp.printLine("Actual:   " + printArray(array1AfterElimination));

        int[] array2 = {5,3,7,3,2,8,10,5,3,5,9};
        int[] array2AfterElimination = eliminateDuplicates(array2);
        SaxionApp.printLine("Expected: 5, 3, 7, 2, 8, 10, 9");
        SaxionApp.printLine("Actual:   " + printArray(array2AfterElimination));

        int[] array3 = {99,98,50,50,98,99,1};
        int[] array3AfterElimination = eliminateDuplicates(array3);
        SaxionApp.printLine("Expected: 99, 98, 50, 1");
        SaxionApp.printLine("Actual:   " + printArray(array3AfterElimination));
    }


    private int[] eliminateDuplicates(int[] input){
        int[] result = new int[input.length];
        //TODO: create a new array and fill it with data from input without the duplicates

        return result;
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
        SaxionApp.start(new EliminationMain(), 1024, 768);
    }
}
