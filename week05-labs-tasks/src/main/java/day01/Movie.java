package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> times;

    public Movie(String title, List<LocalDateTime> time) {
        this.title = title;
        this.times = time;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getTimes() {
        return times;
    }
}
