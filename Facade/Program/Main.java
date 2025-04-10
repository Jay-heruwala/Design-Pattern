package Facade.Program;

// 1. Subsystem 1: DVD Player
class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }

    public void turnOff() {
        System.out.println("DVD Player is OFF");
    }
}

// 2. Subsystem 2: Projector
class Projector {
    public void turnOn() {
        System.out.println("Projector is ON");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }

    public void turnOff() {
        System.out.println("Projector is OFF");
    }
}

// 3. Subsystem 3: Sound System
class SoundSystem {
    public void turnOn() {
        System.out.println("Sound System is ON");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to: " + level);
    }

    public void turnOff() {
        System.out.println("Sound System is OFF");
    }
}

// 4. Facade: HomeTheaterFacade
class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Setting up home theater to watch a movie...");
        dvdPlayer.turnOn();
        projector.turnOn();
        projector.setInput("DVD");
        soundSystem.turnOn();
        soundSystem.setVolume(5);
        dvdPlayer.play(movie);
        System.out.println("Enjoy your movie!");
    }

    public void endMovie() {
        System.out.println("Shutting down home theater...");
        dvdPlayer.stop();
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
    }
}

// 5. Demo Usage
public class Main {
    public static void main(String[] args) {
        // Create subsystem instances
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        // Create facade with subsystems
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Use facade to simplify interaction
        homeTheater.watchMovie("Inception");
        System.out.println("\n---\n");
        homeTheater.endMovie();
    }
}
