package solid.dip;

//High Level Module Depends on Abstraction
public class OrderService {
    private Database db;
    public OrderService(Database database){
        this.db = database;
    }
    public void placeOrder(String item){
        db.save("Order: " + item);
    }
}
