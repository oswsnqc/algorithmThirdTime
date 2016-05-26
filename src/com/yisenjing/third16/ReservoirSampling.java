package com.yisenjing.third16;

/**
 * Created by Yisen on 4/12/16.
 */
public class ReservoirSampling {

    private int count;
    private Integer sample;


    public ReservoirSampling() {
        this.count = 0;
        this.sample = 0;
    }

    public void read() {
        count++;
        int prob = (int)(Math.random() * count);
        if (prob == 0) {
            sample = count;
        }
    }


    public Integer sample() {
        return sample;
    }



}
