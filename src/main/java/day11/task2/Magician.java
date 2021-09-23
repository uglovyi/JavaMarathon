package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack, Healer{
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
    public void physicalAttack(Hero hero) {
        if(hero.health > (int)(this.physAtt * (100 - hero.physDef)/100.f))
            hero.health = hero.health - (int)(this.physAtt * (100 - hero.physDef)/100.f);
        else
            hero.health = 0;
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if(health + this.coefHimself < 100)
            health += this.coefHimself;
        else
            health = 100;
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + this.coefTeammate < 100)
            hero.health += this.coefTeammate;
        else
            hero.health = 100;
        System.out.println(hero);
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
