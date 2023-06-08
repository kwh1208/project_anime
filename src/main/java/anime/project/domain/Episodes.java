package anime.project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class Episodes {
    Anime anime;
    String title;
    Date broadcastDate;
    String story;

}
