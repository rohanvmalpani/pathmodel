package com.rocvit.model.path;

import com.rocvit.model.gtfsmodel.GTFSModel;

/**
 * Created by rohan on 3/21/15.
 */
public class PathModel {
    private final String gtfsFeedLocation;
    private boolean isInitialized;
    private GTFSModel gtfsModel;

    public PathModel(String gtfsFeedLocation) {
        this.gtfsFeedLocation = gtfsFeedLocation;
        intialize();
    }

    private void intialize() {
        if (!isInitialized) {
            gtfsModel = new GTFSModel(gtfsFeedLocation);
            isInitialized = true;
        }
    }

}
