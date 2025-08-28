package org.kaven.kinvana.dominio.service;

import org.kaven.kinvana.persistence.crud.ClienteCrud;
import org.kaven.kinvana.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService implements IClienteService{

    //Inyeccion de dependencia de mi Repositorio (ClienteCrud) [ClienteRepository]
    @Autowired
    private ClienteCrud crud;

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = (List<Cliente>) crud.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer codigo) {
        Cliente cliente = crud.findById(codigo).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        crud.save(cliente);

    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        crud.delete(cliente);

    }
}
