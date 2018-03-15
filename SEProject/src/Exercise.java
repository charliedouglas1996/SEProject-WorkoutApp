
public abstract class Exercise {

    private String exerciseName;
    private String description;
    private String equipment;

    public Exercise(String name, String descrip, String equip, int c) {
        setExerciseName(name);
        setDescription(descrip);
        setEquipment(equip);
        ExerciseStats stats = new ExerciseStats();
        stats.setCount(c);
    }

    public String getExerciseName() {
        return this.exerciseName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setExerciseName(String name) {
        this.exerciseName = name;
    }

    public void setDescription(String descrip) {
        this.description = descrip;
    }

    public void setEquipment(String equip) {
        this.equipment = equip;
    }
}
