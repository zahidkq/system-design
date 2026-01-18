package designPatterns.structural.facade;

public class HomeTheaterFacade {
    DVDPlayer dvdPlayer = new DVDPlayer();
    Lights lights = new Lights();
    Projector projector = new Projector();
    SoundSystem soundSystem = new SoundSystem();
    public void watchMovie(){
        System.out.println("Starting movie...");
        lights.dim();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play();
    }
}
