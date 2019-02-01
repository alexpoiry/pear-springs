package me.alex.tryitout.repository;

import me.alex.tryitout.model.Spacecraft;

import java.util.ArrayList;
import java.util.List;

public class InCodeSpacecraftRepoImpl implements SpacecraftRepo {

  @Override
  public List<Spacecraft> findAll() {
    final List<Spacecraft> registry = new ArrayList<>();

    final Spacecraft spacecraft = new Spacecraft();
    spacecraft.setShipName("Mercury Redstone");
    spacecraft.setDriveType("Liquid Hydrogen");
    spacecraft.setCrew(1);

    registry.add(spacecraft);

    return registry;
  }
}
