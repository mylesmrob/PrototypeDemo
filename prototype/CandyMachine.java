package prototype;

import java.util.HashMap;
import java.util.Map;

public class CandyMachine { //Registry
    private Map<String, Candy> candies = new HashMap<String, Candy>();

    public CandyMachine(){
        details();
    }

    public Candy makeCandy(String type){
        Candy candy = null;
        try{
            candy = (Candy) candies.get(type).clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return candy;
    }

    private void details(){
        Gumball gumball = new Gumball();
        gumball.setName("prototype.Gumball");
        gumball.setNum(1);
        gumball.setPrice(0.25);
        gumball.setSize(1.0);
        gumball.setColor("Default");
        candies.put("prototype.Gumball",gumball);

        Bar bar = new Bar();
        bar.setName("prototype.Bar");
        bar.setNum(2);
        bar.setPrice(1.00);
        bar.setSize(5.0);
        bar.setFlavor("Default");
        candies.put("prototype.Bar",bar);

        Mint mint = new Mint();
        mint.setName("prototype.Mint");
        mint.setNum(3);
        mint.setPrice(0.50);
        mint.setSize(0.5);
        mint.setCoating("Default");
        candies.put("prototype.Mint",mint);
    }
}
