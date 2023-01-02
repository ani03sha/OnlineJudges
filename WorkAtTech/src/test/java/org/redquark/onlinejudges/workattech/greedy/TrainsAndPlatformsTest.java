package org.redquark.onlinejudges.workattech.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.greedy.TrainsAndPlatforms.Train;

public class TrainsAndPlatformsTest {

    private final TrainsAndPlatforms testObject = new TrainsAndPlatforms();

    @Test
    public void testMinPlatforms() {
        Train[] trains = new Train[]{
                new Train(120, 130),
                new Train(130, 150),
                new Train(125, 145),
                new Train(150, 180)
        };
        assertEquals(3, testObject.minPlatforms(trains));
    }
}