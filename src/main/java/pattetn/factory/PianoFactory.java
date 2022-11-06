package pattetn.factory;

public class PianoFactory implements MusicianFactory{
    @Override
    public Musician createMusician() {
        return new Piano();
    }
}
