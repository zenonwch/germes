package com.github.zenonwch.germes.app.service.impl;

import com.github.zenonwch.germes.app.model.entity.geography.City;
import com.github.zenonwch.germes.app.service.GeographicService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Contains unit-tests for {@link GeographicServiceImpl}
 *
 * @author admin
 */
public class GeographicServiceImplTest {
    private GeographicService service;

    @Before
    public void setUp() {
        service = new GeographicServiceImpl();
    }

    @Test
    public void testNoDataReturnedAtStart() {
        final List<City> cities = service.findCities();
        assertTrue(cities.isEmpty());
    }

    @Test
    public void testSaveNewCitySuccess() {
        final City city = new City("Riga");
        service.saveCity(city);

        final List<City> cities = service.findCities();
        assertEquals(1, cities.size());
        assertEquals("Riga", cities.get(0).getName());
    }
}