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
public class Grass extends Pokemon{
}

class bulbasaur extends Pokemon{
    bulbasaur() {
        this.healthPoints = 45;
        this.attack = 49;
        this.defense = 49;
        this.specialAttack = 65;
        this.specialDefense = 65;
        this.speed = 45;
        this.type = "grass-poison";
        this.weight = 6.9;
        this.color = "Green";
        this.eggGroup = "Monster";
        this.eggGroup2 = "Grass";
        this.canBreed = true;
        this.canEvolve = true;
        this.name = "Bulbasaur";
        this.catchval = 45;
    }   
}

class ivysaur extends Pokemon{
    ivysaur() {
        this.healthPoints = 60;
        this.attack = 62;
        this.defense = 63;
        this.specialAttack = 80;
        this.specialDefense = 80;
        this.speed = 60;
        this.type = "grass-poison";
        this.weight = 13;
        this.color = "Green";
        this.eggGroup = "Monster";
        this.eggGroup2 = "Grass";
        this.canBreed = true;
        this.canEvolve = true;
        this.name = "Ivysaur";
        this.catchval = 45;
    }
}

class venasaur extends Pokemon{
    venasaur() {
        this.healthPoints = 80;
        this.attack = 82;
        this.defense = 83;
        this.specialAttack = 100;
        this.specialDefense = 100;
        this.speed = 80;
        this.type = "grass-poison";
        this.weight = 100;
        this.color = "Green";
        this.eggGroup = "Monster";
        this.eggGroup2 = "Grass";
        this.canBreed = true;
        this.canEvolve = false;
        this.name = "Venasaur";
        this.catchval = 45;
    }
}