package pattetn.abstractFactory.rockBand;

import pattetn.abstractFactory.Drummer;

public class RBDrummer implements Drummer {
    @Override
    public void play() {
        System.out.println("Drummer play in RockBand");
    }
}
