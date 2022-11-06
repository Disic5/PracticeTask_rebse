package pattetn.abstractFactory.popBand;

import pattetn.abstractFactory.Piano;

public class PopPiano implements Piano {
    @Override
    public void play() {
        System.out.println("Pianist play in PopBand");
    }
}
