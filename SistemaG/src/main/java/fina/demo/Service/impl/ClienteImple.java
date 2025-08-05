package fina.demo.Service.impl;

import fina.demo.Entity.Cliente;
import fina.demo.Repository.ClienteRepo;
import fina.demo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("clienteService")
public class ClienteImple implements ClienteService {

    @Autowired
    @Qualifier("clientRepo")
    private ClienteRepo clirepo;

    @Override
    public List<Cliente> listCliente() {
        return clirepo.findAll();
    }

    @Override
    public Cliente agregaCliente(Cliente cliente) {
        return clirepo.save(cliente);
    }
}
