package mx.iteso.observer;

import java.util.ArrayList;

public interface Observer {
    void update(String home, String away, int homeGoals, int awayGoals ,ArrayList<Scorer> scorerList);
}
