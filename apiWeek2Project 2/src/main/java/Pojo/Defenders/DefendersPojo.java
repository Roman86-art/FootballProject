package Pojo.Defenders;

import java.util.List;

public class DefendersPojo {
 private String id;
 private Area area;
 private List<ActiveCompetitions> activeCompetitions;
 private List<Squad> squad;

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public Area getArea() {
  return area;
 }

 public void setArea(Area area) {
  this.area = area;
 }

 public List<ActiveCompetitions> getActiveCompetitions() {
  return activeCompetitions;
 }

 public void setActiveCompetitions(List<ActiveCompetitions> activeCompetitions) {
  this.activeCompetitions = activeCompetitions;
 }

 public List<Squad> getSquad() {
  return squad;
 }

 public void setSquad(List<Squad> squad) {
  this.squad = squad;
 }
}
