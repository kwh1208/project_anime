package anime.project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Character {
    Anime anime;
    String name;
    String nameJp;
    String voiceActor;
    String voiceActorJp;
    String pictureLocation;
}
