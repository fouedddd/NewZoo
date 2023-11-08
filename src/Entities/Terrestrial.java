package Entities;

import interfacee.Omnivore;

public final class Terrestrial extends  Animal implements Omnivore {


        private int nbrLegs;

        public Terrestrial() {
        }

        public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
            super(family, name, age, isMammal);
            this.nbrLegs = nbrLegs;
        }

        @Override
        public String toString() {
            return super.toString() + ", nbrLegs:" + nbrLegs;
        }

    @Override
    public void eatPlantAndMeet(Object food) {

    }

    @Override
    public void eatMeat(Object meat) {

    }

    @Override
    public void eatPlant(Object plant) {

    }
}
