package anime.project.repository;

import anime.project.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    public void insert(Anime anime);
    public void update(Anime anime);
    public List<Anime> findByName(String name);
    public List<Anime> findByQuarter(Integer quarter);
    public List<Anime> findByStaff(String name);
    public List<Anime> findByActor(String name);
    public List<Anime> findByStudio(String name);
    public List<Anime> findByGenre(String genre);
    public List<Anime> findByDayOfTheWeek(String day, Integer quarter);
}
