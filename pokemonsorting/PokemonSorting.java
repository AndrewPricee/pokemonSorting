/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonsorting;

/**
 *
 * @author Andrew
 */
class Pokemon{
    
    //pokemon name/nickname default will be class name
    String name;
    
    //level between 1-100
    int level;
    
    //typing (if there are two types seperate with a dash)
    String type;
    
    //weight preset for each class
    double weight;
    
    //stats
    int healthPoints;
    int attack;
    int defense;
    int specialAttack;
    int specialDefense;
    int speed;
    
    //color
    String color;
    
    //gender (male/female/null)
    String gender;
    
    //breeding egg group
    String eggGroup;
    String eggGroup2;
    
    //wild capture value
    int catchval;
    
    boolean canBreed;
    
    boolean canEvolve;

    void information() {
        System.out.println(name);
        
        System.out.println("Hp: " + healthPoints);
        System.out.println("Atk: " + attack);
        System.out.println("Def: " + defense);
        System.out.println("SPAtk: " + specialAttack);
        System.out.println("SPDef: " + specialDefense);
        System.out.println("Spd: " + speed);
        System.out.println("Type: " + type);
        System.out.println("Mass: " + weight + "kg");
        System.out.println("Color: " + color);
        System.out.println("Egg Group 1: " + eggGroup);
        System.out.println("Egg Group 2: " + eggGroup2);
        System.out.println("Capture value: " + catchval);
        System.out.println("Capable of Breeding: " + canBreed);
        System.out.println("Capable of Evolving: " + canEvolve);
    }
    
    
}

public class PokemonSorting {
    public static void main(String[] args) {
        // TODO 
        Pokemon a = new bulbasaur();
        Pokemon b = new ivysaur();
        Pokemon c = new venasaur();
        
        a.information();
        System.out.println("");
        b.information();
        System.out.println("");
        c.information();
    }
    
}
