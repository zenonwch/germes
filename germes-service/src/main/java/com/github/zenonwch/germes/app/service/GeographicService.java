package com.github.zenonwch.germes.app.service;

import com.github.zenonwch.germes.app.model.entity.geography.City;

import java.util.List;

/**
 * Entry point to perform operations
 * over geographic entities
 *
 * @author admin
 */
public interface GeographicService {
    /**
     * Returns list of all existing cities
     *
     * @return .
     */
    List<City> findCities();

    /**
     * Saves specified city instance
     *
     * @param city .
     */
    void saveCity(City city);
}
