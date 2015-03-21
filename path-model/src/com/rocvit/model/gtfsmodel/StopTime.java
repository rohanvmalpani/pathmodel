package com.rocvit.model.gtfsmodel;

import java.util.Date;

/**
 * Created by rohan on 3/21/15.
 */
public class StopTime {

    private String tripId;
    private Date arrivalTime;
    private Date departTime;
    private String stopId;
    private int stopSequence;
    private String stopHeadSign;
    private int pickupType;
    private int dropoffType;
    private double shapeDistTravelled;
    private int timePoint = 1;

}
