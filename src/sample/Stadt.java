package sample;

import java.util.ArrayList;
import java.util.List;

public class Stadt {

    private String name;
    private String Land;
    public List<Temperatur> temperaturList;

    public Stadt(String name, String land, List<Temperatur> temperaturList) {
        this.name = name;
        Land = land;
        this.temperaturList = temperaturList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        Land = land;
    }

    public List<Temperatur> getTemperaturList() {
        return temperaturList;
    }

    public void setTemperaturList(List<Temperatur> temperaturList) {
        this.temperaturList = temperaturList;
    }
}
