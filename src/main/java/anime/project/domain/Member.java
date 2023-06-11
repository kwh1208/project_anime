package anime.project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Member {
    String name;
    String id;
    String password;
    String email;
    String phoneNumber;
}
