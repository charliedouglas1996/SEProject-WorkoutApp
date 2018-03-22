
public class ExerciseTimer {
    
    private static Integer seconds = 0;
    private static Integer minutes = 0;
    private static Integer millis = 0;
    private int Duration;
    
enum Scale{

        MINUTE, SECOND

    }

   
    
    public ExerciseTimer(String type, int duration){
        Duration = duration;
        if(type.equals("seconds"))
        {    startCount(Scale.SECOND, Duration);}
        else if (type.equals("minutes"))
        {    startCount(Scale.MINUTE, Duration);}
        
        System.out.println("Error: Wronge Type");
    }

    public void Pause() {
        wait();
    }
    
    private void run(){
        startCount(Scale.MINUTE, 1); //Test value
    }
    private static void startCount(Scale scale, Integer limit) {

        boolean running = true;
        boolean paused = false;

        while (running) {
 
            try {

                Thread.sleep(10);

                millis += 1;

                if(millis == 100 || (millis >= 100 && millis <= 101)){

                    seconds+=1;

                    millis = 0;

                }

                if(seconds == 60) {

                    minutes+= 1;

                    seconds = 0;

                }

                System.out.println(numDisplay(minutes) + " : " + numDisplay(seconds) + " : " + numDisplay(millis));

                setLimit(scale, limit);

            } catch (InterruptedException e) {

                running = false;

                System.out.println("ERROR: " + e.getCause());

            }

        }
        
        Complete();
    }

 

    private static String numDisplay(Integer num) {

        if(num.toString().length() == 1){

            return "0" + num;

        }

        return num.toString();

    }

 

    private static void setLimit(Scale s, Integer limit) {

        switch (s) {

            case MINUTE:

                if(minutes >= limit) {

                    System.exit(0);

                }

                break;

 

            case SECOND:

                if(seconds >= limit) {

                    System.exit(0);

                }

                break;

        }
    
        
    }
    


    public void Resume() {

    }

    public static void Complete() {
        System.out.println("Exercise Complete");
    }

    public int getExerciseDuration() { 
        return this.Duration;
    }

    public void setExerciseDuration(int time) {
        this.Duration = time;
    }
}

 
