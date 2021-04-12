package prototype;

public class Main {

    public static void main(String[] args) {
        CandyMachine machine = new CandyMachine();

        Gumball gumballA = (Gumball) machine.makeCandy("prototype.Gumball");
        gumballA.setColor("Red");
        System.out.println("prototype.Gumball A: "+gumballA);
        System.out.println("prototype.Gumball A num: "+gumballA.getNum());
        System.out.println("prototype.Gumball A price: "+gumballA.getPrice());
        System.out.println("prototype.Gumball A size: "+gumballA.getSize());
        System.out.println("prototype.Gumball A color: "+gumballA.getColor());

        System.out.print("\n");

        Gumball gumballB = (Gumball) machine.makeCandy("prototype.Gumball");
        gumballB.setColor("Blue");
        System.out.println("prototype.Gumball B: "+gumballB);
        System.out.println("prototype.Gumball B num: "+gumballB.getNum());
        System.out.println("prototype.Gumball B price: "+gumballB.getPrice());
        System.out.println("prototype.Gumball B size: "+gumballB.getSize());
        System.out.println("prototype.Gumball B color: "+gumballB.getColor());
    }
}
