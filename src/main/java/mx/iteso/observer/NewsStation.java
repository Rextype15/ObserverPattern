package mx.iteso.observer;

import mx.iteso.observer.impl.MobileAppDisplay;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

import java.util.ArrayList;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        MobileAppDisplay mobileAppDisplay = new MobileAppDisplay(scoresData);

        ArrayList<Scorer> tacitIntelScorerList = new ArrayList<>();
        ArrayList<Scorer> chivasQueretaroScorerList = new ArrayList<>();
        ArrayList<Scorer> gangaAmericaList = new ArrayList<>();

        tacitIntelScorerList.add(new Scorer("Ray", 15, "Mid", "Tacit Knowledge"));
        tacitIntelScorerList.add(new Scorer("Bryan", 54, "Defensa", "Intel"));
        tacitIntelScorerList.add(new Scorer("Paulo", 12, "Delantero", "Tacit Knowledge"));
        tacitIntelScorerList.add(new Scorer("Octavio", 23, "Delantero", "Intel"));

        chivasQueretaroScorerList.add(new Scorer("Aldo", 34, "Delantero", "Chivas"));
        chivasQueretaroScorerList.add(new Scorer("Victor", 54, "Mid", "Chivas"));
        chivasQueretaroScorerList.add(new Scorer("Pablo", 64, "Defensa", "Queretaro"));
        chivasQueretaroScorerList.add(new Scorer("Gustavo", 76, "Mid", "Queretaro"));

        gangaAmericaList.add(new Scorer("Manuel", 67, "Mid", "La Ganga"));
        gangaAmericaList.add(new Scorer("Juan", 23, "Delantero", "La Ganga"));
        gangaAmericaList.add(new Scorer("Alberto", 55, "Defensa", "La Ganga"));
        gangaAmericaList.add(new Scorer("Emilio", 2, "Mid", "Muebles America"));


        scoresData.setScore("Tacit Knowledge", "Intel", 2, 2, tacitIntelScorerList);
        scoresData.setScore("Chivas", "Queretaro", 2, 2, chivasQueretaroScorerList);
        scoresData.setScore("La Ganga", "Muebles America", 3, 1,gangaAmericaList);

    }
}
