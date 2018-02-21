package com.jwt.location.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.location.entity.Location;
import com.jwt.location.repo.LocationRepository;
import com.jwt.location.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		Location loc = locationRepository.save(location);
		return loc;
	}

	@Override
	public Location updateLocation(Location location) {
		Location loc = locationRepository.save(location);
		return loc;
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);

	}

	@Override
	public Location getLocationById(int id) {
		Location location = locationRepository.findOne(id);
		return location;
	}

	@Override
	public List<Location> getAllLocations() {
		List<Location> locations = locationRepository.findAll();
		return locations;
	}

}
