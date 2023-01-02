package org.redquark.onlinejudges.workattech.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class SackOfGrains {

    public double maxSackValue(Grain[] grains, int w) {
        // Special case
        if (grains == null || grains.length == 0 || w <= 0) {
            return 0;
        }
        // Length of the array
        int n = grains.length;
        // Sort the grains by their values per weight
        Arrays.sort(grains, new GrainComparator());
        // Total price
        double price = 0;
        int index = 0;
        // Loop until we have weight left or until we have
        // grains
        while (w > 0 && index < n) {
            int grainAdded = Math.min(w, grains[index].weight);
            w -= grainAdded;
            price += grainAdded * (1.0 * grains[index].value / grains[index].weight);
            index++;
        }
        return price;
    }

    static class Grain {
        public int weight, value;

        public Grain(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    static class GrainComparator implements Comparator<Grain> {

        @Override
        public int compare(Grain A, Grain B) {
            double valuePerWeightA = 1.0 * A.value / A.weight;
            double valuePerWeightB = 1.0 * B.value / B.weight;
            if (valuePerWeightA == valuePerWeightB) {
                return 0;
            }
            return valuePerWeightA < valuePerWeightB ? 1 : -1;
        }
    }
}
