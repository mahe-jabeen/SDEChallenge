package com.movingaverage;

public interface MovingAverage {
    /**
     * This method adds the element
     * @param data float
     */
    public void addElement(float data);
    /**
     * This method calculates average
     * @return float
     */
    public float getAverage();
}
