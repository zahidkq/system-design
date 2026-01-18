package designPatterns.structural.facade;

// Provide a simple, unified interface to a complex subsystem.

public class FacadeApp {
    public static void main(String[] args){
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.watchMovie();
    }
}
