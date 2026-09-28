package project.studentanalytics.repository;

import java.util.List;

public interface Repository<T> {

    void save(T name);
    T findById(int id);
    List<T> findAll();
    void delete(int id);

}
