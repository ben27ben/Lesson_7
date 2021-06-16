public class newThread {
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static newThread instance;

    private newThread(){}

    //synchronized method to control simultaneous access
    synchronized public static newThread getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new newThread();
        }
        return instance;
    }
}

