package Facade;

public class main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();

        // Simulating different home automation scenarios
        home.arriveHome();
        home.startMusicMode();
        home.startMovieMode();
        home.stopMovieMode();
        home.leaveHome();
    }
}
