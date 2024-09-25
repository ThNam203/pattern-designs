package Examples.Prototype;

public class EntertainmentSystem {
    public static void main(String[] args) {
        // prototypes
        EntertainmentProgram movie = new Movie("Inception", 148);
        EntertainmentProgram tvShow = new TVShow("Breaking Bad", 60);
        EntertainmentProgram musicEvent = new MusicEvent("Rock Concert", 120);

        // clones
        EntertainmentProgram movieClone = movie.clone();
        EntertainmentProgram tvShowClone = tvShow.clone();
        EntertainmentProgram musicEventClone = musicEvent.clone();

        // show prototypes information
        System.out.println("Prototypes information: ");
        System.out.println(movie.getProgramInformation());
        System.out.println(tvShow.getProgramInformation());
        System.out.println(musicEvent.getProgramInformation());

        // show prototype clones information
        System.out.println("Clones information: ");
        System.out.println(movieClone.getProgramInformation());
        System.out.println(tvShowClone.getProgramInformation());
        System.out.println(musicEventClone.getProgramInformation());

        // modify clones information
        movieClone.setName("The Jurassic Park 2017");
        movieClone.setLength(150);

        tvShowClone.setName("Freud Family");
        tvShowClone.setLength(45);

        musicEventClone.setName("SonTung's NewYear Show");
        musicEventClone.setLength(300);

        // show information after modification
        System.out.println("Clones information after modification: ");
        System.out.println(movieClone.getProgramInformation());
        System.out.println(tvShowClone.getProgramInformation());
        System.out.println(musicEventClone.getProgramInformation());
    }
}