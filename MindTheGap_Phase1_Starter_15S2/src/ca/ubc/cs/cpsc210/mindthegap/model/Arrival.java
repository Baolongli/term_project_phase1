package ca.ubc.cs.cpsc210.mindthegap.model;

/**
 * Represents an estimated arrival with time to arrival in seconds,
 * name of destination and platform at which train arrives.  Platform
 * data is assumed to be of the form:
 *    "Travel Direction - Platform Name"
 * with an arbitrary number of spaces either side of "-" and at the
 * start and end of the string.
 */
public class Arrival implements Comparable<Arrival>{
    private int timeToStation;
    private String destination;
    private String plateform;

    /**
     * Constructs a new arrival with the given time to station (in seconds),
     * destination and platform.
     *
     * @param timeToStation  time until train arrives at station (in seconds)
     * @param destination    name of destination station
     * @param platform       name of platform at which train will arrive
     */
    public Arrival(int timeToStation, String destination, String platform) {
        // stub
    	this.timeToStation = timeToStation;
    	this.destination = destination;
    	this.plateform = plateform;
    }

    /**
     * Get direction of travel as indicated by platform prefix (part of platform prior to "-" with
     * leading and trailing whitespace trimmed)
     *
     * @return direction of travel
     */
    public String getTravelDirn() {
    	int index = self.plateform.indexof('-');
    	String dirn = self.plateform.substring(0,index);
    	dirn = dirn.trim();
        return dirn;   // stub
    }

    /**
     * Get platform name as indicated by platform suffix (part of platform after "-" with leading
     * and trailing whitespace trimmed)
     *
     * @return  platform name
     */
    public String getPlatformName() {
    	int index = self.plateform.indexof('-');
    	String dirn = self.plateform.substring(index,self.plateform.length());
    	dirn = dirn.trim();
        return dirn;   // stub
    }

    /**
     * Get time until train arrives at station rounded up to nearest minute.
     *
     * @return  time until train arrives at station in minutes
     */
    public int getTimeToStationInMins() {
        return self.timeToStation/60;   // stub
    }

    public String getDestination() {
        return self.destination;   // stub
    }

    public String getPlatform() {
        return self.plateform;   // stub
    }

    /**
     * Order train arrivals by time until train arrives at station
     * (shorter times ordered before longer times)
     */
    @Override
    public int compareTo(Arrival arrival) {
        // Do not modify the implementation of this method!
        return this.timeToStation - arrival.timeToStation;
    }
}
