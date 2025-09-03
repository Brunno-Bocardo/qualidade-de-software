package br.edu.ifsp.demo_clean.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.repository.RepositoryCarro;
import br.edu.ifsp.demo_clean.repository.RepositoryCliente;
import br.edu.ifsp.demo_clean.repository.RepositoryCarro;

import java.util.*;

@Service
public class ServicoBaguncado {

    private RepositoryCarro r;
    private RepositoryCliente rc;
    private ReposVenda rv;

    public ServicoBaguncado(RepositoryCarro x, RepositoryCliente y, ReposVenda z){
        r=x; rc=y; rv=z;
    }

    //cliente
    public void addCli(Cliente c){rc.save(c);}
    public List<Cliente> tdsCli(){return rc.findAll();}

    //carro
    public void addCar(Carro c){r.save(c);}
    public List<Carro> tudoCarro(){return r.findAll();}

    //venda
    public void addV(Venda v){rv.save(v);}
    public List<Venda> vnd(){return rv.findAll();}
}
