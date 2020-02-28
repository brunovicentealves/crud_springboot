package com.bruno.CrudSpringBoot.interfaceService;

import com.bruno.CrudSpringBoot.modelo.Pessoa;

import java.util.List;
import java.util.Optional;

public interface IpessoaService {

    public List<Pessoa> listar();
    public Optional<Pessoa> listarid(int id);
    public int save (Pessoa p);
    public void delete(int id);
}
