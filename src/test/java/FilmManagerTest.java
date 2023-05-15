import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmManagerTest {

    FilmManager manager = new FilmManager();

    @Test
    public void addFilm0() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm1() {

        manager.addFilm("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm3() {

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3() {

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5() {

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast7() {

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");

        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setLimitLastFilm() {

        FilmManager manager = new FilmManager(7);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");


        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
