package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List <String> findMovieByTime(LocalDateTime time) {
        List <String> moviesList = new ArrayList<>();
        for (Movie movie: movies) {
            for (LocalDateTime item : movie.getTimes()) {
                if (item.equals(time)) {
                    moviesList.add(movie.getTitle());
                }
            }
        }
        return moviesList;
    }
}
