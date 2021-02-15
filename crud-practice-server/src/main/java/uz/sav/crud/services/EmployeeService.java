package uz.sav.crud.services;

import org.springframework.stereotype.Service;
import uz.sav.crud.entity.EmployeeEntity;
import uz.sav.crud.repositories.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> getAllEmployies() {
        return (List<EmployeeEntity>) employeeRepository.findAll();
    }


    public void save(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
    }


}
