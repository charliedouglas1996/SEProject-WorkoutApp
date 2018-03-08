public class Cardio extends Exercise {

	private int duration;
	private float distance;

	public Cardio(String name, String descrip, String imglink, String hyperlink, String newnote, String equip, int c, int duration, float distance) {
		super(name,descrip,imglink,hyperlink,newnote,equip,c);
	}

	public int getDuration() {
		return this.duration;
	}

	public float getDistance() {
		return this.distance;
	}

	public void setDuration(int time) {
		this.duration = time;
	}

	public void setDistance(int d) {

	}

}