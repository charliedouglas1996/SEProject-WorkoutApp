
import java.util.*;

public class User {

    private static User instance = new User();
    private String userName;
    private ArrayList<Double> userWeight;
    private ArrayList<Double> userHeight;
    private ArrayList<Workout> workoutList;
    private ArrayList<Exercise> exerciseList;


	private User(){

	}

	public static User getInstance() {
		return instance;
	}

    public void setName(String name) {
        userName = name;
    }

    public String getName() {
        return userName;
    }

    public ArrayList<Double> getWeight() {
        return userWeight;
    }

    public void addWeight(double weight) {
        userWeight.add((double) weight);
    }

    public ArrayList<Double> getHeight() {
        return userHeight;
    }

    public void addHeight(double height) {
        userHeight.add((double) height);
    }

    // display a list of all exercises
    public void displayExercises() {
        for (int i = 0; i < exerciseList.size(); i++) {
            System.out.println("Exercise " + (i + 1) + ": " + exerciseList.get(i).getExerciseName());
        }
    }

    // show information about a specific exercise
    public void viewExerciseInfo(Exercise ex) {
        System.out.println(ex.getExerciseName() + ", " + ex.getDescription() + ", " + ex.getImage() + ", " + ex.getLink() + ", " + ex.getNotes() + ", " + ex.getEquipment());
    }


	// adds a created exercise to the list of exercises
	public void createExercise(String exType) {
		Exercise exN;
        System.out.println("Exercise Name");
        //String exNName = input
        if (exType.equalsIgnoreCase("m")){
		    //exN = new Muscle();
        }
		//exerciseList.add(exN);
	}


    // TODO - edit the details of a specific exercise
    public void editExercise(Exercise ex) {

    }

    
    public Exercise selectExercise(int n) {
        if (n < exerciseList.size()){
            return exerciseList.get(n);
        }
        System.out.println("Wrong exercise selected");
        return null;
    }
    // removes an exercise from the list of exercises

    public void removeExercise(Exercise ex) {

        exerciseList.remove(ex);
    }

    public void displayWorkouts() {
        for (int i = 0; i < workoutList.size(); i++) {
            System.out.println("Workout " + (i + 1) + ": " + workoutList.get(i).getWorkoutName());
        }
    }

    public void viewWorkoutInfo(Workout w) {
        System.out.println(w.getWorkoutName() + ", " + w.getWorkoutDescription() + ", " + w.getWorkoutDuration() + ", " + w.getWorkoutType());
    }

    public void addWorkout() {
        //workoutList.add(w);
    }

    // TODO - edit a specific workout
    public void editWorkout(Workout w) {

    }

    public void removeWorkout(Workout w) {
        workoutList.remove(w);
    }

    public Workout selectWorkout(int n) {
        if (n < workoutList.size()) {
            return workoutList.get(n);
        }
        System.out.println("Wrong workout selected");
        return null;
    }
}
