package com.shuttle.service;

import com.shuttle.model.Shuttle;
import com.shuttle.repository.ShuttleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShuttleService {
    @Autowired
    private ShuttleRepository shuttleRepository;

    public List<Shuttle> getAllShuttles() {
        return shuttleRepository.findAll();
    }

    public Shuttle saveShuttle(Shuttle shuttle) {
        return shuttleRepository.save(shuttle);
    }
}
