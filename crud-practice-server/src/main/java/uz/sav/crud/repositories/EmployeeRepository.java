package uz.sav.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.sav.crud.entity.EmployeeEntity;

import java.util.UUID;
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, UUID> {

}
