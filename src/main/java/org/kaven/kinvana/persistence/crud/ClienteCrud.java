package org.kaven.kinvana.persistence.crud;

import jakarta.persistence.criteria.CriteriaBuilder;
//import org.springframework.data.repository.CrudRepository;
import org.kaven.kinvana.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteCrud extends JpaRepository<Cliente, Integer> {
}
