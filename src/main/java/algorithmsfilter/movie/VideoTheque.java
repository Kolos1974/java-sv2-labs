package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    List<Movie> movies = new ArrayList<>();


    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category animation) {
        List<Movie> result = new ArrayList<>();
        for(Movie movie : movies){
            if ((movie.getCategory()==animation) && (movie.getRating()>3)) {
                result.add(movie);
            }
        }
        return result;
    }
}
