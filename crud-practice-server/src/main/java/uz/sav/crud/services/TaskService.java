package uz.sav.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.sav.crud.entity.TaskEntity;
import uz.sav.crud.repositories.TaskRepository;

import java.util.List;
import java.util.UUID;


@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public List<TaskEntity> getAllTasks() {
        return taskRepository.findAll();
    }


    public void save(TaskEntity taskEntity) {
        taskRepository.save(taskEntity);
    }

    public TaskEntity findById(UUID id) {
        if (taskRepository.findById(id).isPresent()) {
            return taskRepository.findById(id).get();
        } else return null;
    }

    public Boolean delete(UUID id) {
        if (taskRepository.findById(id).isPresent()) {
            taskRepository.delete(findById(id));
            return true;
        }
        else return false;
    }


}
