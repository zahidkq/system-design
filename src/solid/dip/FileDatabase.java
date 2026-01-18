package solid.dip;

//Low Level Implementation
public class FileDatabase implements Database{
    @Override
    public void save(String data){
        System.out.println("Saving to FileDatabase: " + data);
    }
}
