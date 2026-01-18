package solid.isp;

//Clients should not be forced to depend on interfaces they do not use.

public class ISP {
    public static void main(String[] args){
        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();
    }
}
