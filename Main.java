public class Main{
    public static void main(String[] args) {

        Ironman h1 = new Ironman();
        h1.setName("Ironman");
        h1.setAge("20");
        h1.skill("Shooting");
        h1.weapon("GUN");
        //h1.setNation("USA");
        h1.displayHero();

        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge("100");
        h2.weapon("Hemmer");
        h2.displayHero();
    }
}  
