package anime.project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
public class Comment {
    Long id;
    Member member;
    String anime;
    String comment;
    Date commentDate;
    Integer like;
    Integer dislike;
}
