package uz.sav.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import uz.sav.crud.repositories.PositionRepository;
import uz.sav.crud.services.PositionService;

@RestController
public class PositionController {

    @Autowired
    PositionRepository positionRepository;
    @Autowired
    PositionService positionService;




}
