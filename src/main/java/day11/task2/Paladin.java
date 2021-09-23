package day11.task2;

public class Paladin extends Hero implements Healer{
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
    public String toString() {
        return "Paladin{" +
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
}
