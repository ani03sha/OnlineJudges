package org.redquark.onlinejudges.leetcode.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class SeatReservationManager {

    static class SeatManager {

        private final Queue<Integer> seats;
        private int currentUnreservedSeat;

        public SeatManager(int n) {
            this.currentUnreservedSeat = 0;
            this.seats = new PriorityQueue<>(n);
        }

        public int reserve() {
            if (seats.isEmpty()) {
                this.currentUnreservedSeat++;
                return this.currentUnreservedSeat;
            }
            return seats.remove();
        }

        public void unreserve(int seatNumber) {
            if (seatNumber == this.currentUnreservedSeat) {
                this.currentUnreservedSeat--;
            } else {
                this.seats.offer(seatNumber);
            }
        }
    }
}
