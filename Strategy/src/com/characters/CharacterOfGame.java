package com.characters;

import com.strategy.MovementStrategy;

public abstract class CharacterOfGame {
    private String characterName;

    public CharacterOfGame(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public abstract void walkSomewhere();

}
