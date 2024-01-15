package com.alataf.location.service;

import java.util.List;

import com.alataf.location.entities.Location;

public interface LocationService {
	
	Location saveLocation(Location location);
	
	Location updateLocation(Location location);
	
	void deleteLocation(Location location);
	
	Location getLocation(int id);
	
	List<Location > getAllLocation();
}
