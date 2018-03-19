public class Cardio extends Exercise {

	private int duration;
	private double distance;

	public Cardio(String name, String descrip, String equip, int c, int time, double d) {
		super(name,descrip,equip);
		duration = time;
		distance = d;
	}

	public int getDuration() {
		return this.duration;
	}

	public double getDistance() {
		return this.distance;
	}

	public void setDuration(int time) {
		this.duration = time;
	}

	public void setDistance(int d) {
		this.distance = d;
	}

}