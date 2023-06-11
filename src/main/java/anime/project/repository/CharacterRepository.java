package anime.project.repository;

import anime.project.domain.Character;

import java.util.List;

public interface CharacterRepository {
    public void insert(Character character);
    public void update(Character character);
    public List<Character> findByName(String name);
    public List<Character> findByActor(String name);
    public List<Character> findByAnime(String name);
}
