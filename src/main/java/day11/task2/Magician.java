package day11.task2;

public class Magician extends Hero implements MagicAttack{
    public Magician() {
        //this.name = name;
        this.physAtt = 5;
        this.magicAtt = 20;
        this.physDef = 0;
        this.magicDef = 80;
        this.coefHimself = 0;
        this.coefTeammate = 0;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health > (int)(this.magicAtt * (100 - hero.magicDef)/100.f))
            hero.health = hero.health - (int)(this.magicAtt * (100 - hero.magicDef)/100.f);
        else
            hero.health = 0;
        System.out.println(hero);
    }
}
