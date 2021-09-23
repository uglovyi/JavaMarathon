package day11.task2;

 public abstract class Hero implements PhysAttack{
    static final int MAX_HEALTH = 100;
    int health = MAX_HEALTH;
    int physDef, magicDef, physAtt, magicAtt, coefHimself, coefTeammate;

     @Override
     public void physicalAttack(Hero hero) {
         if(hero.health > (int)(this.physAtt * (100 - hero.physDef)/100.f))
             hero.health = hero.health - (int)(this.physAtt * (100 - hero.physDef)/100.f);
         else
             hero.health = 0;
         System.out.println(hero);
     }
 }
