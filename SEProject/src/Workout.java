
import java.util.*;

public class Workout {

    private String workoutName;
    private boolean workoutType;
    private String workoutDescription;
    private int duration;
    private ArrayList<Exercise> exerciseList;

    public Workout(String name, boolean type, String descrip, int time) {
        setWorkoutName(name);
        setWorkoutType(type);
        setWorkoutDescription(descrip);
        setDuration(time);
    }

    public String getWorkoutName() {
        return this.workoutName;
    }

    public boolean getWorkoutType() {
        return this.workoutType;
    }

    public String getWorkoutDescription() {
        return this.workoutDescription;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setWorkoutName(String name) {
        this.workoutName = name;
    }

    public void setWorkoutType(boolean type) {
        this.workoutType = type;
    }

    public void setWorkoutDescription(String descrip) {
        this.workoutDescription = descrip;
    }

    public void setDuration(int time) {
        this.duration = time;
    }

    public void addWExercise(Exercise ex) {
        exerciseList.add(ex);
    }

    public void removeWExercise(Exercise ex) {
        exerciseList.remove(ex);
    }

    public void printExerciseList() {
        for(int i = 0; i < exerciseList.size(); i++){
            System.out.println(exerciseList.get(i).getExerciseName());
        }
    }

}
