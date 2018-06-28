package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Gudetama;
import com.greenfoxacademy.gudetamagochi.repositories.TamaRepository;
import com.greenfoxacademy.gudetamagochi.repositories.TamaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TamaServiceImpl implements TamaService{

  TamaRepository tamaRepository;

  @Autowired
  public TamaServiceImpl(TamaRepositoryImpl tamaRepository) {
    this.tamaRepository = tamaRepository;
  }

  @Override
  public void login(String name) {
    if (tamaRepository.findOneById(name) == null) {
      tamaRepository.save(new Gudetama(name));
    }
  }

  @Override
  public Gudetama getTama(String name) {
    return tamaRepository.findOneById(name);
  }
}
