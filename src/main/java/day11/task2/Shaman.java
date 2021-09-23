package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{
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
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if(health + this.coefHimself < MAX_HEALTH)
            health += this.coefHimself;
        else
            health = MAX_HEALTH;
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + this.coefTeammate < MAX_HEALTH)
            hero.health += this.coefTeammate;
        else
            hero.health = MAX_HEALTH;
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
