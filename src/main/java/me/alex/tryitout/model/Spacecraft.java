package me.alex.tryitout.model;

public class Spacecraft {
  private String shipName;
  private String driveType;
  private int crew;

  public String getShipName() {
    return shipName;
  }

  public void setShipName(String shipName) {
    this.shipName = shipName;
  }

  public String getDriveType() {
    return driveType;
  }

  public void setDriveType(String driveType) {
    this.driveType = driveType;
  }

  public int getCrew() {
    return crew;
  }

  public void setCrew(int crew) {
    this.crew = crew;
  }
}
