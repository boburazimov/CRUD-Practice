package uz.sav.crud.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import uz.sav.crud.entity.Position;
import uz.sav.crud.repository.rest.projection.CustomPosition;

@CrossOrigin
@RepositoryRestResource(path = "position", collectionResourceRel = "position", excerptProjection = CustomPosition.class)
public interface PositionRepo extends JpaRepository<Position, Integer> {
}
