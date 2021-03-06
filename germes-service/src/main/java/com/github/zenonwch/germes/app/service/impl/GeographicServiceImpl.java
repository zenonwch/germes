package com.github.zenonwch.germes.app.service.impl;

import com.github.zenonwch.germes.app.infra.util.CommonUtil;
import com.github.zenonwch.germes.app.model.entity.geography.City;
import com.github.zenonwch.germes.app.service.GeographicService;

import java.util.ArrayList;
import java.util.List;

/**
 * Default implementation of the {@link GeographicService}
 *
 * @author admin
 */
public class GeographicServiceImpl implements GeographicService {
    /**
     * Internal list of cities
     */
    private final List<City> cities;

    public GeographicServiceImpl() {
        cities = new ArrayList<>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCity(final City city) {
        if (!cities.contains(city)) {
            cities.add(city);
        }
    }
}
