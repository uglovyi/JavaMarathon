package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    public Paladin() {
        //this.name = name;
        this.physAtt = 15;
        this.magicAtt = 0;
        this.physDef = 50;
        this.magicDef = 20;
        this.coefHimself = 25;
        this.coefTeammate = 10;
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
        return "Paladin{" +
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
}
