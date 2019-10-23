package com;

import com.characters.*;
import com.strategy.WalkAndFlyStrategy;
import com.strategy.WalkStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Strategy pattern. Develop a game system model. Provide for the presence of fantasy characters:
 * orcs, trolls, pegasuses, elves, vampires, harpies, etc. Take into account that some characters walk,
 * others fly, and others walk and fly. A group of characters can also fly with the help of magic.
 */

public class Main {
    public static void main(String[] args) {
        List<CharacterOfGame> listOfCharacters = new ArrayList<>();
        listOfCharacters.add(new Vampire (new WalkAndFlyStrategy()));
        listOfCharacters.add(new Orc(new WalkStrategy()));
        listOfCharacters.add(new Elf(new WalkStrategy()));
        listOfCharacters.add(new Pegasus(new WalkAndFlyStrategy()));
        listOfCharacters.add(new Troll(new WalkStrategy()));

        for(CharacterOfGame characterOfGame : listOfCharacters){
            System.out.println(characterOfGame.getCharacterName());
            characterOfGame.walkSomewhere();
        }
    }
}
