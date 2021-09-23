package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    public Shaman() {
        //this.name = name;
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 20;
        this.magicDef = 20;
        this.coefHimself = 50;
        this.coefTeammate = 30;
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
        return "Shaman{" +
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
