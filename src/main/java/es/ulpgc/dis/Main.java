package es.ulpgc.dis;

import es.ulpgc.dis.control.TsvMovieLoader;
import es.ulpgc.dis.model.Movie;
import es.ulpgc.dis.view.MainFrame;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/title.basics3.tsv");
        TsvMovieLoader loader = new TsvMovieLoader(file);
        List<Movie> movies = loader.loadMovies();

        new MainFrame(movies);
    }
}
