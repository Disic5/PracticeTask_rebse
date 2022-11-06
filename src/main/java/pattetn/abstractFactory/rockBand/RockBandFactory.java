package pattetn.abstractFactory.rockBand;

import pattetn.abstractFactory.BandTeam;
import pattetn.abstractFactory.Drummer;
import pattetn.abstractFactory.Guitar;
import pattetn.abstractFactory.Piano;

public class RockBandFactory implements BandTeam {
    @Override
    public Drummer getDrummer() {
        return new RBDrummer();
    }

    @Override
    public Piano getPiano() {
        return new RBPiano();
    }

    @Override
    public Guitar getGuitar() {
        return new RBGuitar();
    }
}
