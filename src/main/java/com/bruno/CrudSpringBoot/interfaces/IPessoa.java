package com.bruno.CrudSpringBoot.interfaces;

import com.bruno.CrudSpringBoot.modelo.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoa  extends CrudRepository<Pessoa,Integer> {


}
