package anime.project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class VoiceActor {
    Long id;
    String name;
    String nameJp;
    Date birth;
    String agency;
    String twitter;
    String info;
    String pictureLocation;
}