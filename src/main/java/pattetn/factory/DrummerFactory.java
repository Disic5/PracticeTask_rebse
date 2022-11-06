package pattetn.factory;

public class DrummerFactory implements MusicianFactory{
    @Override
    public Musician createMusician() {
        return new Drummer();
    }
}
