package fina.demo.Service;

import fina.demo.Entity.Cliente;

import java.util.List;

public interface ClienteService {

    public abstract List<Cliente> listCliente();
    public abstract Cliente agregaCliente(Cliente cliente);
}
