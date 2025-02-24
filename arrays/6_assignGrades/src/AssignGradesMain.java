import nl.saxion.app.SaxionApp;

public class AssignGradesMain implements Runnable{
    int[] grades = {40,55, 70, 58, 68};

    public void run(){
        //TODO: write a algorithm that shows the grades for these students
    }


    public static void main(String[] args) {
        SaxionApp.start(new AssignGradesMain(), 1024, 768);
    }


}
