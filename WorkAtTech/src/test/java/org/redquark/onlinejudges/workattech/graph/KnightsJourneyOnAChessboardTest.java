package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.graph.KnightsJourneyOnAChessboard.Cell;

public class KnightsJourneyOnAChessboardTest {

    private final KnightsJourneyOnAChessboard testObject = new KnightsJourneyOnAChessboard();

    @Test
    public void testMinMovesRequired() {
        int n = 6;
        Cell start = new Cell(6, 1);
        Cell end = new Cell(2, 4);
        assertEquals(3, testObject.minMovesRequired(n, start, end));

        n = 2;
        start = new Cell(1, 1);
        end = new Cell(1, 1);
        assertEquals(0, testObject.minMovesRequired(n, start, end));

        n = 5;
        start = new Cell(1, 1);
        end = new Cell(2, 2);
        assertEquals(-1, testObject.minMovesRequired(n, start, end));

        n = 3;
        start = new Cell(3, 3);
        end = new Cell(1, 1);
        assertEquals(4, testObject.minMovesRequired(n, start, end));
    }
}