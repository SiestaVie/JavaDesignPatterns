package com.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class BacteriumFactory {

    private final Map<ReproductionType, ReproductionAbility> bacteriumReproductionAbility;

    public BacteriumFactory() {
        bacteriumReproductionAbility = new EnumMap<>(ReproductionType.class);
    }

    ReproductionAbility createPotion(ReproductionType type) {
        ReproductionAbility bacterium = bacteriumReproductionAbility.get(type);
        if (bacterium == null) {
            switch (type) {
                case BUDDING:
                    bacterium = new BacteriumWithBudding();
                    bacteriumReproductionAbility.put(type, bacterium);
                    break;
                case MULTIPLE_DIVISION:
                    bacterium = new BacteriumMultipleDivision();
                    bacteriumReproductionAbility.put(type, bacterium);
                    break;
                case BINARY_DIVISION:
                    bacterium = new BacteriumBinaryDivision();
                    bacteriumReproductionAbility.put(type, bacterium);
                    break;
                case SPORE_PROPAGATION:
                    bacterium = new BacteriumSporePropagation();
                    bacteriumReproductionAbility.put(type, bacterium);
                    break;
                case TRANSFORMATION:
                    bacterium = new BacteriumTransformation();
                    bacteriumReproductionAbility.put(type, bacterium);
                    break;
                default:
                    break;
            }
        }
        return bacterium;
    }

}
