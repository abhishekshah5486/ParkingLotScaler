package com.abhishek.parkinglotscaler.Repositories;

import com.abhishek.parkinglotscaler.Models.Gate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class GateRepository {
    private Map<Integer, Gate> gates = new HashMap<>();

    public Optional<Gate> findById(Long id) {
        if (gates.get(id) == null) return Optional.empty();
        return Optional.of(gates.get(id));
    }
}
