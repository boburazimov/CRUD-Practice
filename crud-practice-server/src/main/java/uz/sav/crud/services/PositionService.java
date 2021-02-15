package uz.sav.crud.services;

import org.springframework.stereotype.Service;
import uz.sav.crud.repositories.PositionRepository;

@Service
public class PositionService {
    private PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

}
