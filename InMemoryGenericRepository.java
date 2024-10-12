package genericClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryGenericRepository<T extends BaseEntity> implements GenericRepository<T> {
    private List<T> database = new ArrayList<>();

    @Override
    public void save(T entity) {
        if (entity.getId() == null) {
            entity.setId((long) (database.size() + 1));
        }
        database.add(entity);
    }

    @Override
    public void delete(T entity) {
        database.remove(entity);
    }

    @Override
    public T findById(Long id) {
        Optional<T> entity = database.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
        return entity.orElse(null);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(database);
    }
}
