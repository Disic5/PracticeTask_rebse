package pattetn.abstractFactory.popBand;

import pattetn.abstractFactory.Guitar;

public class PopGuitar implements Guitar {
    @Override
    public void play() {
        System.out.println("Guitarist play in PopBand");
    }
}
