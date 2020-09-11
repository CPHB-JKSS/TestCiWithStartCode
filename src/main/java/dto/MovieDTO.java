package dto;

import entities.Movie;

public class MovieDTO {
    private Integer id;
    private String title;
    private int release;

    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.release = movie.getRelease();
    }
}
