package com.movingaverage;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageImpl implements MovingAverage {

    private Queue<Float> queue;
    private float sum;
    private int averageSize;

    public MovingAverageImpl(int averageSize) {
        queue = new LinkedList<>();
        this.averageSize = averageSize;
    }

    @Override
    public void addElement(float data) {
        if (queue.size() >= averageSize) {
            float dataToRemove = queue.poll();
            sum -= dataToRemove;
        }

        queue.add(data);
        sum += data;
    }

    @Override
    public float getAverage() {
        return sum / averageSize;
    }
}
