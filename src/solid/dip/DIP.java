package solid.dip;

//High Level modules should not depend on low level modules. Both should depend on abstraction.
//Abstractions should not depend on details. Details should depend on Abstractions.

public class DIP {
    public static void main(String[] args){
        Database db = new MySQLDatabase();
        OrderService service = new OrderService(db);
        service.placeOrder("MacBook Pro");
    }
}
