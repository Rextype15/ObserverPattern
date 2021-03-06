package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;
import mx.iteso.observer.Scorer;

import java.util.ArrayList;
import java.util.List;

public class MobileAppDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private ArrayList<Scorer> scorerList;
    private Subject scoresData;

    public MobileAppDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("Sent from Mobile App");
        System.out.println("Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);
        if(scorerList.size() > 0) {
            System.out.println("Scorers are:");
            for(Scorer scorer : scorerList) {
              System.out.println("Name: " + scorer.Name);
              System.out.println("Number: " + scorer.Number);
              System.out.println("Position: " + scorer.Position);
              System.out.println("Team: " + scorer.Team);
            }
        }

    }

    public void update(String home, String away, int homeGoals, int awayGoals, ArrayList<Scorer> scorerList) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorerList = scorerList;
        display();
    }

}
