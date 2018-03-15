
import java.util.*;

public class User {

    private static User instance = new User();
    private String userName;
    private ArrayList<Double> userWeight;
    private ArrayList<Double> userHeight;
    private ArrayList<Workout> workoutList;
    private ArrayList<Exercise> exerciseList;

    private User() {

    }

    public static User getInstance() {
        return instance;
    }

    public void setName(String name) {
        userName = name;
    }

    public String getName() {
        return userName;
    }

    public ArrayList<Double> getWeight() {
        return userWeight;
    }

    public void addWeight(double weight) {
        userWeight.add((double) weight);
    }

    public ArrayList<Double> getHeight() {
        return userHeight;
    }

    public void addHeight(double height) {
        userHeight.add((double) height);
    }

    //******************************** EXERCISE METHODS **********************************//
    // display a list of all exercises
    public void displayExercises() {
        for (int i = 0; i < exerciseList.size(); i++) {
            System.out.println("Exercise " + (i + 1) + ": " + exerciseList.get(i).getExerciseName());
        }
    }

    // show information about a specific exercise
    public void viewExerciseInfo(Exercise ex) {
        System.out.println(ex.getExerciseName() + ", " + ex.getDescription() + ", "  + ex.getEquipment());
    }


	// adds a created exercise to the list of exercises
	public void createExercise(String exType) {
        Exercise exN;

        System.out.println("Name of the exercise?");
        String exNName = input();
        System.out.println("Description");
        String des = input();
       /* System.out.println("ImageLink");
        String imL = input();
        System.out.println("hyperLink");
        String hyL = input();
        System.out.println("newNote");
        String nNote = input();*/
        System.out.println("Equipment");
        String equip = input();

        if (exType.equalsIgnoreCase("m")) {
            System.out.println("Number of reps");
            int rep = inputInt();
            System.out.println("weight");
            double equipW = inputDouble();
            System.out.println("Muscle Name/Type");
            String mName = input();
            exN = new Muscle(exNName, des, equip, 0, rep, equipW, mName);
            exerciseList.add(exN);
        }
        else{
            System.out.println("Time");
            int t = inputInt();
            System.out.println("Distance");
            double d = inputDouble();
            exN = new Cardio(exNName, des, equip, 0, t, d);
            exerciseList.add(exN);
        }
    }


    // adds a created exercise to the list of exercises
    public void addExercise(Exercise ex) {
        exerciseList.add(ex);
    }

    // TODO - edit the details of a specific exercise
    public void editExercise(Exercise ex) {

    }

    
    public Exercise selectExercise(int n) {
        if (n < exerciseList.size()){
            return exerciseList.get(n);
        }
        System.out.println("Wrong exercise selected");
        return null;
    }

    // removes an exercise from the list of exercises

    public void removeExercise(Exercise ex) {

        exerciseList.remove(ex);
    }

    //******************************** WORKOUT METHODS **********************************//

    public void displayWorkouts() {
        for (int i = 0; i < workoutList.size(); i++) {
            System.out.println("Workout " + (i + 1) + ": " + workoutList.get(i).getWorkoutName());
        }
    }

    public void viewWorkoutInfo(Workout w) {
        System.out.println(w.getWorkoutName() + ", " + w.getWorkoutDescription() + ", " + w.getWorkoutDuration() + ", " + w.getWorkoutType());
    }

    public void addWorkout() {
        //workoutList.add(w);
    }

    // TODO - edit a specific workout
    public void editWorkout(Workout w) {

    }

    public void removeWorkout(Workout w) {
        workoutList.remove(w);
    }

    public Workout selectWorkout(int n) {
        if (n < workoutList.size()) {
            return workoutList.get(n);
        }
        System.out.println("Wrong workout selected");
        return null;
    }






    // this method reads the users input
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // this method converts the input to an integer with the use of an exception to  eb=nsure that the input is an integer
    public static int inputInt () {
        int numInput = -1;
        try {
            numInput = Integer.parseInt(input());
        } catch (NumberFormatException nfe) {
        }

        return numInput;
    }

    // this method converts the input to an integer with the use of an exception to  eb=nsure that the input is an integer
    public static double inputDouble ()
    {
        double numInput = -1;
        try
        {
            numInput = Double.parseDouble(input());
        }
        catch (NumberFormatException nfe)
        {
        }

        return numInput;
    }
}
