package com.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BacterialColonyBreedingProcessAccountingSystem {
    private List<ReproductionAbility> list;
    private List<ReproductionAbility> listForUncheckedBacteria;

    public BacterialColonyBreedingProcessAccountingSystem() {
        list = new ArrayList<>();
        listForUncheckedBacteria = new ArrayList<>();
        fillList();
    }

    private void fillList() {
        BacteriumFactory factory = new BacteriumFactory();
        list.add(factory.createPotion(ReproductionType.BUDDING));
        list.add(factory.createPotion(ReproductionType.BINARY_DIVISION));
        list.add(factory.createPotion(ReproductionType.MULTIPLE_DIVISION));
        list.add(factory.createPotion(ReproductionType.SPORE_PROPAGATION));
        list.add(factory.createPotion(ReproductionType.TRANSFORMATION));

        listForUncheckedBacteria.add(factory.createPotion(ReproductionType.SPORE_PROPAGATION));
        listForUncheckedBacteria.add(factory.createPotion(ReproductionType.BUDDING));
        listForUncheckedBacteria.add(factory.createPotion(ReproductionType.TRANSFORMATION));
        listForUncheckedBacteria.add(factory.createPotion(ReproductionType.MULTIPLE_DIVISION));
        listForUncheckedBacteria.add(factory.createPotion(ReproductionType.BINARY_DIVISION));

    }

    /**
     * Get a read-only list of all bacterias
     *
     * @return list
     */
    public final List<ReproductionAbility> getBacteriasAccountList() {
        return Collections.unmodifiableList(this.list);
    }

    /**
     * Get a read-only list of all bacterias
     *
     * @return list
     */
    public final List<ReproductionAbility> getBacteriasAccountListUnchecked() {
        return Collections.unmodifiableList(this.listForUncheckedBacteria);
    }

    /**
     * Enumerate bacterias
     */
    public void enumerate() {
        System.out.println("Checked bacterias : ");
        for (ReproductionAbility reproductionAbility : list) {
            reproductionAbility.breed();
        }
        System.out.println();
        System.out.println("Unchecked bacterias : ");
        for (ReproductionAbility reproductionAbility : listForUncheckedBacteria) {
            reproductionAbility.breed();
        }
    }
}
