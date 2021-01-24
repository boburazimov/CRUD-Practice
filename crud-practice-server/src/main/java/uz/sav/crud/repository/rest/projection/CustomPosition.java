package uz.sav.crud.repository.rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.sav.crud.entity.Position;

import java.util.UUID;

@Projection(name = "customPosition", types = Position.class)
public interface CustomPosition {

    UUID getId();

    String getName();

}
