package Facade;

public class main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();

        // Simulating different home automation scenarios
        System.out.println("Home Arrival : ");
        home.arriveHome();
        System.out.println("Music Mode : ");
        home.startMusicMode();
        System.out.println("Movie Mode : ");
        home.startMovieMode();
        System.out.println("Stop Movie Mode : ");
        home.stopMovieMode();
        System.out.println("Leave Home : ");
        home.leaveHome();
    }
}
