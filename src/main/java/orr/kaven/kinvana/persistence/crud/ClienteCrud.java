package orr.kaven.kinvana.persistence.crud;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;
import orr.kaven.kinvana.persistence.entity.Cliente;

public interface ClienteCrud extends CrudRepository<Cliente, Integer> {
}
