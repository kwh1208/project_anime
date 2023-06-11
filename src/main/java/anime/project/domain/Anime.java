package anime.project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Component
@Getter
@Setter
public class Anime {
    Long id;
    String title;
    String titleJp;
    Integer episode;
    Date start_date;
    String DayOfTheWeek;
    Integer quarter;//23년 1분기 = 2301
    String genre;
    String director;
    String original;
    String subDirector;
    String scriptwriter;
    String liveDirector;
    String liveAnimator;
    String artDirector;
    String filmDirector;
    String CGDirector;
    String editor;
    String music;
    String musicDirector;
    String producer;
    String animationStudio;
    String Studio;
    String BroadcastStations;
    String streamingService;
    ArrayList<String> pvLink;
    String twitter;
    String pictureLocation;
    Integer recommendation;
    String story;
}
