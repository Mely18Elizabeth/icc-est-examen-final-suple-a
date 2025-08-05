package models;

import java.util.List;

public class Estudiante {
  String nombre;
  String cedula;
  List<Double> calificaciones; 
  int porcentajeUnicos;
  public Estudiante(String nombre, String cedula, int porcentajeUnicos) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.porcentajeUnicos = porcentajeUnicos;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getCedula() {
    return cedula;
  }
  public void setCedula(String cedula) {
    this.cedula = cedula;
  }
  public int getPorcentajeUnicos() {
    return porcentajeUnicos;
  }
  public void setPorcentajeUnicos(int porcentajeUnicos) {
    this.porcentajeUnicos = porcentajeUnicos;
  }

  public int getPromedio(){
    int promedio;
    promedio= List<calificaciones>;
    int promres= promedio/6;

  }

  public int calcularPorcentajes(){
    int res;
    res= nombre.concat(nombre);
    int mult= res*2;
    int porcentaje= res/100 * mult;
    System.out.println("Porcentaje de Caracteres: "+ porcentaje+"%");
  }
}
