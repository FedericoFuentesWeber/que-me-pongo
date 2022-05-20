package Clima;

import java.util.*;

public class Clima {

  private Integer tempeartura;
  private float probabilidadDeLluvia;

  public Clima(String ciudad){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
    HashMap<String, Object> temperature = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
    this.tempeartura = (Integer) temperature.get("Value");
    this.probabilidadDeLluvia = (float) condicionesClimaticas.get(0).get("PrecipitationProbability");
  }
}
