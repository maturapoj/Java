class Ironman extends SuperHero implements SkillHero,Nation{

    private String weapon;
    private String skill;

    public void skill(String skill) {
        System.out.println("skill ="+skill);
    }
    public void moing(String moving){
    
    }
    public void weapon(String weapon){
        System.out.println("Weapon = "+weapon);

    }
    public void jumping(String jump){

    }
    public void setNation(String nation){
        System.out.println("Nation = "+nation);
    }
}