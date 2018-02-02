package com.github.zenonwch.germes.app.model.search.criteria;

import com.github.zenonwch.germes.app.model.entity.transport.TransportType;

import java.util.Objects;

/**
 * Filtering criteria for search stations operation
 *
 * @author admin
 */
public class StationCriteria {
    /**
     * City's name
     */
    private String name;

    private TransportType transportType;

    /**
     * Station's address: street, zipCode, building number
     */
    private String address;

    public StationCriteria() {
    }

    private StationCriteria(final String name) {
        this.name = Objects.requireNonNull(name);
    }

    public StationCriteria(final TransportType transportType) {
        this.transportType = Objects.requireNonNull(transportType);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(final TransportType transportType) {
        this.transportType = transportType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Returns filtering criteria to search stations that
     * contains specified name parameter
     *
     * @param name .
     * @return .
     */
    public static StationCriteria byName(final String name) {
        return new StationCriteria(name);
    }
}
