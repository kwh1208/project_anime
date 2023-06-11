package anime.project.repository;

import anime.project.domain.Episodes;

public interface EpisodesRepository {
    public void insert(Episodes episodes);
    public void update(Episodes episodes);
    public void delete(Episodes episodes);
}
