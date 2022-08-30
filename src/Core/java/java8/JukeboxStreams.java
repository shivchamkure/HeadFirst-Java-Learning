package Core.java.java8;

import javax.swing.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JukeboxStreams {
    public static void main(String[] args) {
        List<Song> songs = new LouSongs().getSongs();


        Predicate<Song> rockGenre = song -> song.getGenre().contains("Rock");
        List<Song> rockSongs = songs.stream()
                .filter(rockGenre)
                .collect(Collectors.toList());
        System.out.println(rockSongs);


        Function<Song, String> getGenre = Song::getGenre;
        List<String>  genreList = songs.stream()
                .map(getGenre)
                .distinct().toList();
        System.out.println("\n\n" + genreList);

    }
}
