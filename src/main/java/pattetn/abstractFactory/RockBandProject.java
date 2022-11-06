package pattetn.abstractFactory;

import pattetn.abstractFactory.rockBand.RockBandFactory;

public class RockBandProject {
    public static void main(String[] args) {
        BandTeam bandTeam = new RockBandFactory();
        Drummer drummer = bandTeam.getDrummer();
        Guitar guitar = bandTeam.getGuitar();
        Piano piano = bandTeam.getPiano();
        System.out.println("create band....");
        drummer.play();
        guitar.play();
        piano.play();
    }
}
