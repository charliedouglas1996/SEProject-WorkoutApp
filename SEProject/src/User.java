
import java.util.*;

public class User {

	private User instance;
	private String userName;
	private float[] userWeight;
	private float[] userHeight;
	private ArrayList<Workout> workoutList;
	private ArrayList<Exercise> exerciseList;

	private User() {

	}

	public User getInstance() {
		return this.instance;
	}

	public String getName() {
                return null;
	}

	public float getWeight() {
		return 0;
	}

	public float getHeight() {
		return 0;
	}

	public void setName(String name) {
	}

	public void setWeight(float weight) {
		// TODO - implement User.setWeight
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param height
	 */
	public void setHeight(float height) {
		// TODO - implement User.setHeight
		throw new UnsupportedOperationException();
	}

	public void displayExercises() {
		// TODO - implement User.displayExercises
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ex
	 */
	public void viewExerciseInfo(Exercise ex) {
		// TODO - implement User.viewExerciseInfo
		throw new UnsupportedOperationException();
	}

	public void addExercise() {
		// TODO - implement User.addExercise
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ex
	 */
	public void editExercise(Exercise ex) {
		// TODO - implement User.editExercise
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ex
	 */
	public void removeExercise(Exercise ex) {
		// TODO - implement User.removeExercise
		throw new UnsupportedOperationException();
	}

	public void displayWorkouts() {
		// TODO - implement User.displayWorkouts
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param w
	 */
	public void viewWorkoutInfo(Workout w) {
		// TODO - implement User.viewWorkoutInfo
		throw new UnsupportedOperationException();
	}

	public void addWorkout() {
		// TODO - implement User.addWorkout
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param w
	 */
	public void editWorkout(Workout w) {
		// TODO - implement User.editWorkout
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param w
	 */
	public void removeWorkout(Workout w) {
		// TODO - implement User.removeWorkout
		throw new UnsupportedOperationException();
	}

	public Workout selectWorkout() {
		return null;
	}

}