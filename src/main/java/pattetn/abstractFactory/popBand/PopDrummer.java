package pattetn.abstractFactory.popBand;

import pattetn.abstractFactory.Drummer;

public class PopDrummer implements Drummer {
    @Override
    public void play() {
        System.out.println("Drummer play in PopBand");
    }
}
