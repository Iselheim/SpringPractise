package pl.bolka.aleksander.exersice;

public interface EntityMapper<D extends BaseDTO, E extends BaseEntity> {

     D toDTO(E entity);

     Class<E> getType();
}
