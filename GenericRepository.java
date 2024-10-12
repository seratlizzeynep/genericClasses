package genericClasses;

import java.util.List;

public interface GenericRepository<T extends BaseEntity> {
    void save(T entity);
    void delete(T entity);
    T findById(Long id);
    List<T> findAll();
}
