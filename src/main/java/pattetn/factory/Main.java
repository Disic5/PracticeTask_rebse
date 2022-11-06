package pattetn.factory;

public class Main {
    public static void main(String[] args) {
        MusicianFactory musicianFactory = new GuitarFactory();
        Musician musician = musicianFactory.createMusician();
        musician.play();
    }

}
// либо с статическим методом

//public class Main {
//    public static void main(String[] args) {
//        MusicianFactory musicianFactory = createMusicianBySpecialty("drummer");
//        Musician musician = musicianFactory.createMusician();
//        musician.play();
//    }
//    static MusicianFactory createMusicianBySpecialty(String specialty){
//        if (specialty.equalsIgnoreCase("drummer")){
//            return new DrummerFactory();
//        }else if(specialty.equalsIgnoreCase("piano")){
//            return new PianoFactory();
//        }else if (specialty.equalsIgnoreCase("guitar")){
//            return new GuitarFactory();
//        }else {
//            throw new RuntimeException(specialty + "is unknown musician");
//        }
//    }
//}
