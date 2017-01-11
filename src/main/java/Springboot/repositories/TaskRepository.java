package Springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import Springboot.models.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
