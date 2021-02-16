package uz.sav.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import uz.sav.crud.entity.PositionEntity;

import java.util.Optional;
import java.util.UUID;

public interface PositionRepository extends JpaRepository<PositionEntity, Integer> {

    Optional<PositionEntity> findByName(String name);


}
