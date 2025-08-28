package org.kaven.kinvana.dominio.service;

import org.kaven.kinvana.persistence.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IClienteService {
    //firmas de metodo del CRUD
    List<Cliente> listarClientes();
    Cliente buscarClientePorId(Integer codigo);
    void guardarCliente(Cliente cliente);
    void eliminarCliente(Cliente cliente);


}
