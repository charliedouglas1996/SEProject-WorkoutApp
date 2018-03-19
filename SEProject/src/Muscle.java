public class Muscle extends Exercise {

	private int reps;
	private double equipmentWeight;
	private String muscleType;

	public Muscle(String name, String descrip, String equip, int c, int rep, double weight, String muscleName) {
		super(name,descrip,equip);
		reps = rep;
		equipmentWeight = weight;
		muscleType = muscleName;
	}

	public int getReps() {
		return this.reps;
	}

	public double getEquipmentWeight() {
		return this.equipmentWeight;
	}

	public String getMuscleType() {
		return this.muscleType;
	}

	public void setReps(int rep) {
		this.reps = rep;
	}

	public void setEquipmentWeight(double weight) {
		this.equipmentWeight = weight;
	}

	public void setMuscleType(String muscleName) {
		this.muscleType = muscleName;
	}

}