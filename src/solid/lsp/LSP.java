package solid.lsp;

//Subtypes must be substitutable for their base types.

public class LSP {
    public static void main(String[] args){
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();
        Bird ostrich = new Ostrich();
        ostrich.eat();
    }
}
