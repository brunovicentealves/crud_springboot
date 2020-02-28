package com.bruno.CrudSpringBoot.service;

import com.bruno.CrudSpringBoot.interfaceService.IpessoaService;
import com.bruno.CrudSpringBoot.interfaces.IPessoa;
import com.bruno.CrudSpringBoot.modelo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService implements IpessoaService {
    @Autowired
    private IPessoa data;
    @Override
    public List<Pessoa> listar() {
        return (List<Pessoa>) data.findAll();
    }

    @Override
    public Optional<Pessoa> listarid(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Pessoa p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
