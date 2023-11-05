package ru.netology;

public class MovieManager {
    private String[] movies = {
            "Бладшот",
            "Вперёд",
            "Отель \"Белград\"",
            "Джентльмены",
            "Человек-невидимка",
    };
    private int lastAddedLimit;


    public MovieManager() {
        this.lastAddedLimit = 5;
    }

    public MovieManager(int setLastAddedLimit) {
        if (setLastAddedLimit < 1){
            setLastAddedLimit = 1;
        }
        this.lastAddedLimit = setLastAddedLimit;
    }

    public void addNewMovie(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;

    }

    public String[] findAllMovies() {
        return movies;
    }

    public String[] findLastAddedMovies() {
        String[] lastAddedMovies = new String[lastAddedLimit];
        for (int i = 0; i <lastAddedLimit ; i++) {
            lastAddedMovies[i] = movies[movies.length - 1 - i];

        }
        return lastAddedMovies;
    }
}
