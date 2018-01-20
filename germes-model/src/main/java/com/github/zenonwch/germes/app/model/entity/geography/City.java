package com.github.zenonwch.germes.app.model.entity.geography;

import com.github.zenonwch.germes.app.model.entity.base.AbstractEntity;

import java.util.Set;

/**
 * Any locality that contains transport stations
 *
 * @author admin
 */
public class City extends AbstractEntity {
    private String name;

    /**
     * Name of the district where city is placed
     */
    private String district;

    /**
     * Name of the region where district is located.
     * Region is a top-level area in the country
     */
    private String region;

    /**
     * Set of transport stations located in the City
     */
    private Set<Station> stations;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(final String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public Set<Station> getStations() {
        return stations;
    }

    public void setStations(final Set<Station> stations) {
        this.stations = stations;
    }
}
