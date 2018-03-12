import java. util.*;

public class SEProject {
    static User user;

    public static void main(String[] args) {

        user = new User();
        boolean loop = true;
        
        while(loop)
        {
            homepage();
        }

    }
    
    public static void homepage(){
        System.out.println(" \n HOMEPAGE\n .........");
        System.out.println("Please select one of the following: \n 1. Workouts \n 2.Exercises \n 3.Settings \n 0. Exit System");
        
        int option = inputInt();
        
        if(option == 0)
        {
            System.exit(0);
        }
        else if(option ==1)
        {
            workoutSelect();
        }
        else if (option==2)
        {
            exerciseSelect();
        }
        else if (option==3)
        {
            setting();
        }
        else
        {
            System.out.println("That is an invalid option. Please try again");
            homepage();
        }
    }
    
    public static void workoutSelect(){
        System.out.println("Welcome to the WORKOUT");
        System.out.println("\n Please select one of the following: \n 1. View Workouts \n 2. Add Workout \n 3. Edit Workout \n 4. Remove Workout \n 5. return to Homepage \n 0. Exit System");
        
        int option = inputInt();
        Workout w;
        if(option == 0)
        {
            System.exit(0);
        }
        else if(option ==1)
        {
            user.displayWorkouts();
        }
        else if (option==2)
        {
            user.addWorkout();
        }
        else if (option==3)
        {
            w = user.selectWorkout();
            user.editWorkout(w);
        }
        else if (option==4)
        {
            w = user.selectWorkout();
            user.removeWorkout(w);
        }
        else if (option==5)
        {
            homepage();
        }
        else
        {
            System.out.println("That is an invalid option. Please try again");
            workoutSelect();
        }
    }
    
    public static void exerciseSelect(){
        System.out.println("Welcome to the EXERCISE \n .........");
        System.out.println("\n Please select one of the following: \n 1. View Exercise \n 2. Add Exercise \n 3. Edit Exercise \n 4. Remove Exercise \n 5. return to Homepage \n 0. Exit System");
        
        int option = inputInt();
        Exercise ex;
        if(option == 0)
        {
            System.exit(0);
        }
        else if(option ==1)
        {
            user.displayExercises();
        }
        else if (option==2)
        {
            user.addExercise();
        }
        else if (option==3)
        {
            ex = user.selectExercise();
            user.editExercise(ex);
        }
        else if (option==4)
        {
            ex = user.selectExercise();
            user.removeExercise(ex);
        }
        else if (option==5)
        {
            homepage();
        }
        else
        {
            System.out.println("That is an invalid option. Please try again");
            exerciseSelect();
        }
        
    }
    
    public static void setting(){
        System.out.println("Welcome to the SETTINGS \n .........");
        System.out.println("\n Please select one of the following: \n 1. Change Name \n 2. Change Weight \n 3. Change Height \n 4. return to Homepage \n 0. Exit System");
        
        int option = inputInt();
        Exercise ex;
        if(option == 0)
        {
            System.exit(0);
        }
        else if(option ==1)
        {
            System.out.println("Please enter a new name");
            String name = input();
            user.setName(name);
        }
        else if (option==2)
        {
            System.out.println("Please enter a new weight");
            float wei = inputInt();
            user.setWeight(wei);
        }
        else if (option==3)
        {
            System.out.println("Please enter a new height");
            float hei = inputInt();
            user.setHeight(hei);
        }
        else if (option==4)
        {
            homepage();
        }
        else
        {
            System.out.println("That is an invalid option. Please try again");
            setting();
        }
        
    }
    
    // this method reads the users input
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    // this method converts the input to an integer with the use of an exception to  eb=nsure that the input is an integer
    public static int inputInt ()
    {
        int numInput = -1;
        try 
        {
            numInput = Integer.parseInt(input());
        }
        catch (NumberFormatException nfe)
        { 
        }
        
        return numInput;
    }
}
