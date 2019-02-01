package me.alex.tryitout.service;

import me.alex.tryitout.model.Spacecraft;
import me.alex.tryitout.repository.SpacecraftRepo;

import java.util.List;

public class SpacecraftServiceImpl implements SpacecraftService {

  private SpacecraftRepo repo;

  public SpacecraftServiceImpl(SpacecraftRepo repo) {
    this.repo = repo;
  }

  @Override
  public List<Spacecraft> getShipRegistry() {
    return repo.findAll();
  }

  public void setRepo(SpacecraftRepo repo) {
    this.repo = repo;
  }
}
