package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MovieManagerTest {
    @Test
    public void shouldShowAllMovies(){
        MovieManager manager = new MovieManager();
        String[] expected = {"Бладшот", "Вперёд", "Отель \"Белград\"", "Джентльмены",
                "Человек-невидимка",};
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals (expected , actual);

    }
    @Test
    public void shouldAddNewMovie(){
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Тролли. Мировой тур");
        String[] expected = {"Бладшот", "Вперёд", "Отель \"Белград\"", "Джентльмены",
                "Человек-невидимка","Тролли. Мировой тур"};
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals (expected , actual);

    }
    @Test
    public void shouldShowLastAddedMovies(){
        MovieManager manager = new MovieManager();

        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель \"Белград\"", "Вперёд", "Бладшот"};
        String[] actual = manager.findLastAddedMovies();
        Assertions.assertArrayEquals (expected , actual);

    }
    @Test
    public void shouldShow3LastAddedMovies(){
        MovieManager manager = new MovieManager(3);

        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель \"Белград\""};
        String[] actual = manager.findLastAddedMovies();
        Assertions.assertArrayEquals (expected , actual);

    }
    @Test
    public void shouldNotSetLastAddedMoviesBelow1(){
        MovieManager manager = new MovieManager(-5);

        String[] expected = {"Человек-невидимка"};
        String[] actual = manager.findLastAddedMovies();
        Assertions.assertArrayEquals (expected , actual);

    }

}