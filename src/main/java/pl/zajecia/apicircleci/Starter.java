package pl.zajecia.apicircleci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Starter {

    private VideoCourseRepository videoCourseRepository;

    @Autowired
    public Starter(VideoCourseRepository videoCourseRepository) {
        this.videoCourseRepository = videoCourseRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        VideoCourse videoCourse1 =
                new VideoCourse("Programowanie w języku Java",
                        "https://www.youtube.com/watch?v=wa8fZP6IBuU&t=692s",
                        "https://greenlogic.pl/blog/java-12-nowa-java-i-jej-nowe-funkcje/");

        VideoCourse videoCourse2 =
                new VideoCourse("Testowanie",
                        "https://www.youtube.com/watch?v=BijU1qqSH80",
                        "https://www.samouczekprogramisty.pl/testy-jednostkowe-z-junit/");

        VideoCourse videoCourse3 =
                new VideoCourse("Docker",
                        "https://www.youtube.com/watch?v=TPZCyxefPDI",
                        "https://pl.wikipedia.org/wiki/Docker_(oprogramowanie)");

        videoCourseRepository.save(videoCourse1);
        videoCourseRepository.save(videoCourse2);
        videoCourseRepository.save(videoCourse3);
    }
}
