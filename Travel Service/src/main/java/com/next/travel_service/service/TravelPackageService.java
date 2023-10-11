package com.next.travel_service.service;

import com.next.travel_service.entity.TravelPackage;
import com.next.travel_service.repository.TravelPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TravelPackageService {
    @Autowired
    private TravelPackageRepository travelPackageRepository;

    public TravelPackage addTravelPackage(TravelPackage travelPackage) {
        return travelPackageRepository.save(travelPackage);
    }

    public List<TravelPackage> fetchAllPackages(){
        return travelPackageRepository.findAll();
    }
}
