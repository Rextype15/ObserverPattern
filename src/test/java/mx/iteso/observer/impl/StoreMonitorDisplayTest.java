package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        ArrayList<Scorer> tacitIntelScorerList = new ArrayList<>();

        tacitIntelScorerList.add(new Scorer("Ray", 15, "Mid", "Tacit Knowledge"));
        tacitIntelScorerList.add(new Scorer("Bryan", 54, "Defensa", "Intel"));
        tacitIntelScorerList.add(new Scorer("Paulo", 12, "Delantero", "Tacit Knowledge"));
        tacitIntelScorerList.add(new Scorer("Octavio", 23, "Delantero", "Intel"));

        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0,tacitIntelScorerList);
    }
}
