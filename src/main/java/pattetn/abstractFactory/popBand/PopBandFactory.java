package pattetn.abstractFactory.popBand;

import pattetn.abstractFactory.BandTeam;
import pattetn.abstractFactory.Drummer;
import pattetn.abstractFactory.Guitar;
import pattetn.abstractFactory.Piano;

public class PopBandFactory implements BandTeam {
    @Override
    public Drummer getDrummer() {
        return new PopDrummer();
    }

    @Override
    public Piano getPiano() {
        return new PopPiano();
    }

    @Override
    public Guitar getGuitar() {
        return new PopGuitar();
    }
}
