public class Workout {

	private String workoutName;
	private boolean workoutType;
	private String workoutDescription;
	private int duration;

	public Workout(String name, boolean workoutType, String descrip, int time) {
		
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
		// TODO - implement Workout.addWExercise
		throw new UnsupportedOperationException();
	}

	public void removeWExercise(Exercise ex) {
		// TODO - implement Workout.removeWExercise
		throw new UnsupportedOperationException();
	}

}