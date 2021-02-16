package uz.sav.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sav.crud.entity.PositionEntity;
import uz.sav.crud.entity.template.ResponseData;
import uz.sav.crud.repositories.PositionRepository;
import uz.sav.crud.services.PositionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("rest/position")
public class PositionController {

    @Autowired
    PositionRepository positionRepository;
    @Autowired
    PositionService positionService;

    @GetMapping("/add/{positionName}")
    public ResponseData addPosition(@PathVariable String positionName) {
        if (positionService.getByName(positionName).isPresent()) {
            return new ResponseData("Already exists", 210);
        }
        PositionEntity positionEntity = new PositionEntity(positionName);
        positionService.save(positionEntity);
        return new ResponseData("Success", 200);
    }

    @GetMapping("/list")
    public ResponseData<List<PositionEntity>> getList() {
        return new ResponseData<>(positionService.getAll());
    }

    //nme Collectorsni ob tashadiz?
}
