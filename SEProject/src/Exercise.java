public abstract class Exercise {

	private String exerciseName;
	private String description;
	private String imageLink;
	private String link;
	private String notes;
	private String equipment;

	/**
	 * 
	 * @param name
	 * @param descrip
	 * @param imglink
	 * @param hyperlink
	 * @param newnote
	 * @param equip
	 * @param c
	 */
	public Exercise(String name, String descrip, String imglink, String hyperlink, String newnote, String equip, int c) {
		// TODO - implement Exercise.Exercise
		throw new UnsupportedOperationException();
	}

	public String getExerciseName() {
		return this.exerciseName;
	}

	public String getDescription() {
		return this.description;
	}

	public String getImage() {
		// TODO - implement Exercise.getImage
		throw new UnsupportedOperationException();
	}

	public String getLink() {
		return this.link;
	}

	public String getNotes() {
		return this.notes;
	}

	public String getEquipment() {
		return this.equipment;
	}

	/**
	 * 
	 * @param name
	 */
	public void setExerciseName(String name) {
		this.exerciseName = name;
	}

	/**
	 * 
	 * @param descrip
	 */
	public void setDescription(String descrip) {
		this.description = descrip;
	}

	/**
	 * 
	 * @param imglink
	 */
	public void setImage(String imglink) {
		// TODO - implement Exercise.setImage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param hyperlink
	 */
	public void setLink(String hyperlink) {
		this.link = hyperlink;
	}

	/**
	 * 
	 * @param newnote
	 */
	public void setNotes(String newnote) {
		this.notes = newnote;
	}

	/**
	 * 
	 * @param equip
	 */
	public void setEquipment(String equip) {
		this.equipment = equip;
	}

}