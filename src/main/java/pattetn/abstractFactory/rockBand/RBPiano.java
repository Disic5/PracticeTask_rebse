package pattetn.abstractFactory.rockBand;

import pattetn.abstractFactory.Piano;

public class RBPiano implements Piano {
    @Override
    public void play() {
        System.out.println("Pianist play in RockBand");
    }
}
