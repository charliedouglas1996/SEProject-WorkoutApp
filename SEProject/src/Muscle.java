public class Muscle extends Exercise {

	private int reps;
	private float equipmentWeight;
	private String muscleType;

	public Muscle(String name, String descrip, String imglink, String hyperlink, String newnote, String equip, int c, int rep, float weight, String muscleType) {
		super(name,descrip,imglink,hyperlink,newnote,equip,c);
	}

	public int getReps() {
		return this.reps;
	}

	public float getEquipmentWeight() {
		return this.equipmentWeight;
	}

	public String getMuscleType() {
		return this.muscleType;
	}

	public void setReps(int rep) {
		this.reps = rep;
	}

	public void setEquipmentWeight(float weight) {
		this.equipmentWeight = weight;
	}

	public void setMuscleType(String muscleName) {
		this.muscleType = muscleName;
	}

}