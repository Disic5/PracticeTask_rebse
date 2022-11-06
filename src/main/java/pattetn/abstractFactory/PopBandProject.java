package pattetn.abstractFactory;

import pattetn.abstractFactory.popBand.PopBandFactory;

public class PopBandProject {
    public static void main(String[] args) {
        BandTeam bandTeam = new PopBandFactory();
        Drummer drummer = bandTeam.getDrummer();
        Guitar guitar = bandTeam.getGuitar();
        Piano piano = bandTeam.getPiano();
        System.out.println("create Pop Band...");
        drummer.play();
        guitar.play();
        piano.play();
    }
}
