package mx.iteso.observer;

import mx.iteso.observer.impl.MobileAppDisplay;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;
import mx.iteso.observer.Scorer;

import java.util.ArrayList;
import java.util.List;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        MobileAppDisplay mobileAppDisplay = new MobileAppDisplay(scoresData);

        ArrayList<Scorer> tacitIntelScorerList = new ArrayList<Scorer>();
        ArrayList<Scorer> chivasQueretaroScorerList = new ArrayList<Scorer>();
        ArrayList<Scorer> gangaAmericaList = new ArrayList<Scorer>();



        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1, tacitIntelScorerList);
        scoresData.setScore("Chivas", "Queretaro", 2, 1, chivasQueretaroScorerList);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0,gangaAmericaList);
    }
}
