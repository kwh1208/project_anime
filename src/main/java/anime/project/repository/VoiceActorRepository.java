package anime.project.repository;

import anime.project.domain.Character;
import anime.project.domain.VoiceActor;

import java.util.List;

public interface VoiceActorRepository {
    public void insert(VoiceActor voiceActor);
    public void update(VoiceActor voiceActor);
    public List<Character> findByName(String name);
}
