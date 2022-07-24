package com.tts.WeatherApp;

import java.util.Map;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
    public Map<String, String> coord;
    public List<Map<String, String>> weather;
    public String base;
    public Map<String, String> main;
    public Map<String, String> wind;
    public Map<String, String> clouds;
    public String dt;
    public Map<String, String> sys;
    public String id;
    public String name;
    public String cod;
}