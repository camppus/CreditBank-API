package frandev.api.shared.ports;


import frandev.api.shared.entities.Pageable;


public interface CrudRepository<T, ID> {
    T create(T entity);
    T update(ID id, T entity);
    T getById(ID id);
    Pageable<T> getAll(int page, int limit);
    void delete(ID id);
}