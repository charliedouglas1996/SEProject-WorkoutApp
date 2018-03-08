public class Workout {

	private String workoutName;
	private boolean workoutType;
	private String workoutDescription;
	private int duration;

	/**
	 * 
	 * @param name
	 * @param type
	 * @param descrip
	 * @param time
	 */
	public Workout(String name, boolean type, String descrip, int time) {
		// TODO - implement Workout.Workout
		throw new UnsupportedOperationException();
	}

	public String getWorkoutName() {
		return this.workoutName;
	}

	public String getWorkoutType() {
		// TODO - implement Workout.getWorkoutType
		throw new UnsupportedOperationException();
	}

	public String getWorkoutDescription() {
		return this.workoutDescription;
	}

	public int getDuration() {
		return this.duration;
	}

	/**
	 * 
	 * @param name
	 */
	public void setWorkoutName(String name) {
		this.workoutName = name;
	}

	public void setWorkoutType() {
		// TODO - implement Workout.setWorkoutType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param descrip
	 */
	public void setWorkoutDescription(String descrip) {
		this.workoutDescription = descrip;
	}

	/**
	 * 
	 * @param time
	 */
	public void setDuration(int time) {
		this.duration = time;
	}

	/**
	 * 
	 * @param ex
	 */
	public void addWExercise(Exercise ex) {
		// TODO - implement Workout.addWExercise
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ex
	 */
	public void removeWExercise(Exercise ex) {
		// TODO - implement Workout.removeWExercise
		throw new UnsupportedOperationException();
	}

}