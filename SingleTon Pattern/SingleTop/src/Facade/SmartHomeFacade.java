package Facade;

public class SmartHomeFacade {
    private Lights lights;
    private SecuritySystem security;
    private AirConditioning ac;
    private EntertainmentSystem entertainment;

    public SmartHomeFacade() {
        this.lights = new Lights();
        this.security = new SecuritySystem();
        this.ac = new AirConditioning();
        this.entertainment = new EntertainmentSystem();
    }

    public void leaveHome() {
        security.armSystem();
        lights.turnOff();
        ac.turnOff();
        entertainment.turnOffTV();
        entertainment.stopMusic();
    }

    public void arriveHome() {
        security.disarmSystem();
        lights.turnOn();
        ac.turnOn();
        ac.setTemperature(22); // Default to 22°C
    }

    public void startMovieMode() {
        lights.turnOff();
        ac.setTemperature(20);
        entertainment.turnOnTV();
    }

    public void stopMovieMode() {
        entertainment.turnOffTV();
        lights.turnOn();
    }

    public void startMusicMode() {
        entertainment.playMusic();
    }

    public void stopMusicMode() {
        entertainment.stopMusic();
    }
}
