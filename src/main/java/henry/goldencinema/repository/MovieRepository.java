package henry.goldencinema.repository;

import henry.goldencinema.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

    Movie findMovieById(String id);

    Movie findMovieByTitle(String title);

    List<Movie> getMoviesByNowPlaying(boolean nowPlay);

}
