package me.alex.tryitout.repository;

import me.alex.tryitout.model.Spacecraft;

import java.util.List;

public interface SpacecraftRepo {
  List<Spacecraft> findAll();
}
