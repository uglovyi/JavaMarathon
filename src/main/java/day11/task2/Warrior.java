package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior() {
        //this.name = name;
        this.physAtt = 30;
        this.magicAtt = 0;
        this.physDef = 80;
        this.magicDef = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health > (int)(this.physAtt * (100 - hero.physDef)/100.f))
            hero.health = hero.health - (int)(this.physAtt * (100 - hero.physDef)/100.f);
        else
            hero.health = 0;
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
