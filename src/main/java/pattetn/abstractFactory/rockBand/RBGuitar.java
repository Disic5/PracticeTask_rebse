package pattetn.abstractFactory.rockBand;

import pattetn.abstractFactory.Guitar;

public class RBGuitar implements Guitar {
    @Override
    public void play() {
        System.out.println("Guitarist play in RockBand");
    }
}
