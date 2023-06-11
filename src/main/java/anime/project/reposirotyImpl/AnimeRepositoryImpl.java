package anime.project.reposirotyImpl;

import anime.project.domain.Anime;
import anime.project.repository.AnimeRepository;

import java.util.List;

public class AnimeRepositoryImpl implements AnimeRepository {

    @Override
    public void insert(Anime anime) {

    }

    @Override
    public void update(Anime anime) {

    }

    @Override
    public List<Anime> findByName(String name) {
        return null;
    }

    @Override
    public List<Anime> findByQuarter(Integer quarter) {
        return null;
    }

    @Override
    public List<Anime> findByStaff(String name) {
        return null;
    }

    @Override
    public List<Anime> findByActor(String name) {
        return null;
    }

    @Override
    public List<Anime> findByStudio(String name) {
        return null;
    }

    @Override
    public List<Anime> findByGenre(String genre) {
        return null;
    }

    @Override
    public List<Anime> findByDayOfTheWeek(String day, Integer quarter) {
        return null;
    }
}
