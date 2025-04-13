// Abstract class Game
// The play() method itself is not overridden, but the methods it calls (initialize(), startPlay(), endPlay()) are overridden in each subclass.
// The play() method is final and defines the sequence of actions for any game. It cannot be overridden by subclasses, ensuring that the flow of actions (initialize, start, end) stays the same.
abstract class Game {
    // Abstract methods - must be implemented by subclasses
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    
    public final void play() {    // Template method - final to prevent overriding
                                  // This is the sequence of steps for any game
        initialize();
        startPlay();
        endPlay();
    }
}

class Cricket extends Game {    // Subclass Cricket - implements the abstract methods
    // Initialize the cricket game
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    // Start playing the cricket game
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    // End the cricket game
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

// Subclass Football - implements the abstract methods
class Football extends Game {
    // Initialize the football game
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    // Start playing the football game
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    // End the football game
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
public class abstractunique {
    public static void main(String[] args)
    {
        // Create objects for each sport
        Cricket cricket = new Cricket();   // Polymorphism in action
        cricket.play();                  // Calls play() from Game class, but specific methods from Cricket class

        System.out.println(); // Just adding a line break for clarity

        Game football = new Football(); // Another sport
        football.play();                // Calls play() from Game class, but specific methods from Football class
    }
}
// The play() method from the Game class is called, but the specific initialize(), startPlay(), and endPlay() methods are taken from the respective subclasses (Cricket or Football).