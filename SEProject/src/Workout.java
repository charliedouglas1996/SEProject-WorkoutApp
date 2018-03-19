
import java.util.*;

public class Workout {

    private String workoutName;
    //private boolean workoutType;
    private String workoutDescription;
    private int duration;
    private ArrayList<Exercise> exerciseList;

    public Workout(String name, String descrip, int time) {
        setWorkoutName(name);
        //setWorkoutType(type);
        setWorkoutDescription(descrip);
        setWorkoutDuration(time);
        exerciseList = new ArrayList<>();
    }

    public String getWorkoutName() {
        return this.workoutName;
    }

    public String getWorkoutDescription() {
        return this.workoutDescription;
    }

    public int getWorkoutDuration() {
        return this.duration;
    }

    public void setWorkoutName(String name) {
        this.workoutName = name;
    }

    public void setWorkoutDescription(String descrip) {
        this.workoutDescription = descrip;
    }

    public void setWorkoutDuration(int time) {
        this.duration = time;
    }

    public void addWExercise(Exercise ex) {
        exerciseList.add(ex);
    }

    public void removeWExercise(Exercise ex) {
        exerciseList.remove(ex);
    }

    public void printExerciseList() {
        System.out.println("Current exercises within this workout are:");
        for(int i = 0; i < exerciseList.size(); i++){
            System.out.println("Exercise " + (i + 1) + ": " + exerciseList.get(i).getExerciseName());
        }
    }
    
    public void printWorkoutInfo(){
        System.out.println("-----WORKOUT-----");
        System.out.println("Name: "+getWorkoutName());
        //System.out.println("Type: "+getWorkoutType());
        System.out.println("Description: "+getWorkoutDescription());
        System.out.println("Duration:" +getWorkoutDuration());
        printExerciseList();
    }

    public Exercise selectExfromW(int n){
        if (n <= exerciseList.size()){
            return exerciseList.get(n-1);
        }
        System.out.println("Wrong exercise selected");
        return null;
    }

    /*public boolean getWorkoutType() {
        return this.workoutType;
    }*/
    /*public void setWorkoutType(boolean type) {
        this.workoutType = type;
    }*/
}
