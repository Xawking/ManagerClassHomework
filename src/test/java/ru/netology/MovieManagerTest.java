package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {
    @Test
    public void shouldShowNoMovies() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddNewMovie() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowAllMovies() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Бладшот");
        manager.addNewMovie("Вперёд");
        manager.addNewMovie("Отель \"Белград\"");
        manager.addNewMovie("Джентльмены");
        manager.addNewMovie("Человек-невидимка");
        String[] expected = {"Бладшот", "Вперёд", "Отель \"Белград\"", "Джентльмены", "Человек-невидимка"};
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLastAddedMovies() {
        MovieManager manager = new MovieManager();
        manager.addNewMovie("Бладшот");
        manager.addNewMovie("Вперёд");
        manager.addNewMovie("Отель \"Белград\"");
        manager.addNewMovie("Джентльмены");
        manager.addNewMovie("Человек-невидимка");
        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель \"Белград\"", "Вперёд", "Бладшот"};
        String[] actual = manager.findLastAddedMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow3LastAddedMovies() {
        MovieManager manager = new MovieManager(3);
        manager.addNewMovie("Бладшот");
        manager.addNewMovie("Вперёд");
        manager.addNewMovie("Отель \"Белград\"");
        manager.addNewMovie("Джентльмены");
        manager.addNewMovie("Человек-невидимка");
        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель \"Белград\""};
        String[] actual = manager.findLastAddedMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNotSetLastAddedMoviesBelow1() {
        MovieManager manager = new MovieManager(-5);
        int expected = 1;
        int actual = manager.getLastAddedLimit();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldShowMinLastAddedMovies() {
        MovieManager manager = new MovieManager();


        manager.addNewMovie("Отель \"Белград\"");
        manager.addNewMovie("Джентльмены");
        manager.addNewMovie("Человек-невидимка");
        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель \"Белград\""};
        String[] actual = manager.findLastAddedMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

}