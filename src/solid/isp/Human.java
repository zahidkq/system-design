package solid.isp;

public class Human implements Workable, Eatable{
    @Override
    public void work(){
        System.out.println("Human Working...");
    }
    @Override
    public void eat(){
        System.out.println("Human Eating...");
    }
}
