public class WorkoutStats {

	private int count;
	private int totalTime;

	public int getCount() {
		return this.count;
	}

	public int getTotalTime() {
		return this.totalTime;
	}

	/**
	 * 
	 * @param c
	 */
	public void setCount(int c) {
		this.count = c;
	}

	/**
	 * 
	 * @param exerciseDuration
	 */
	public void setTotalTime(int exerciseDuration) {
		this.totalTime = exerciseDuration;
	}

}