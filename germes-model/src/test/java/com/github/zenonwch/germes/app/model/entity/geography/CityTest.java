package com.github.zenonwch.germes.app.model.entity.geography;

import com.github.zenonwch.germes.app.model.entity.transport.TransportType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Contains unit-tests to check functionality of {@link City} class
 *
 * @author admin
 */
public class CityTest {

    private City city;

    @Before
    public void setUp() {
        city = new City("Riga");
    }

    @Test
    public void testAddValidStationSuccess() {
        final Station station = city.addStation(TransportType.AUTO);

        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }

    @Test (expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);

        fail();
    }

    @Test
    public void testAddDuplicateStationFailure() {
        city.addStation(TransportType.AUTO);
        city.addStation(TransportType.AUTO);

        assertEquals(1, city.getStations().size());
    }

    @Test
    public void testRemoveStationSuccess() {
        final Station station = city.addStation(TransportType.AUTO);
        city.removeStation(station);
        
        assertFalse(containsStation(city, station));
        assertTrue(city.getStations().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNullStationFailure() {
        city.removeStation(null);

        fail();
    }

    private boolean containsStation(final City city, final Station station) {
        return city.getStations().contains(station);
    }
}