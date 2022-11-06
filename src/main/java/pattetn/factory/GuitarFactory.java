package pattetn.factory;

public class GuitarFactory implements MusicianFactory{
    @Override
    public Musician createMusician() {
        return new Guitar();
    }
}
