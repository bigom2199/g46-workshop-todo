package se.lexicon.g46todoapi.service;

public interface TaskService {

List<TaskService> getAll();
Optional<TaskService> findById(long id);
Optional<TaskService> create(TaskDTOFrom from);
Optional<TaskService> update(TaskDToFrom from);
Optional<TaskService> createOrUpdate(TaskDTOFrom from);




}
