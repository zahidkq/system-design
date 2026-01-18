package designPatterns.structural.facade;

class SoundSystem {
    void on() {
        System.out.println("Sound System ON");
    }

    void setVolume(int level) {
        System.out.println("Sound volume set to " + level);
    }
}
