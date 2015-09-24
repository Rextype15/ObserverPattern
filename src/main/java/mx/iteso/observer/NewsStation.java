package mx.iteso.observer;

import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;
import mx.iteso.observer.Scorer;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        List<Scorer> tacitIntelScorerList = new List<Scorer>();
        List<Scorer> chivasQueretaroScorerList = new List<Scorer>();
        Lsit<ScorerList> gangaAmericaList = new List<Scorer>();



        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1, tacitIntelScorerList);
        scoresData.setScore("Chivas", "Queretaro", 2, 1, chivasQueretaroScorerList);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0,gangaAmericaList);
    }
}
