package uz.sav.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import uz.sav.crud.entity.PositionEntity;

import java.util.UUID;

public interface PositionRepository extends CrudRepository<PositionEntity,Integer> {
}
