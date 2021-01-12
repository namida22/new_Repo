package sample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Temperatur temperatur1 = new Temperatur(1.2f, 1.2f,1);
        List<Temperatur> temperaturList = new ArrayList<>(){};
        temperaturList.add(temperatur1);
        Stadt stadt1 = new Stadt("name", "land", temperaturList);
        List<Stadt> stadtList = new ArrayList<>(){};
        stadtList.add(stadt1);

        StadtRepository stadtRepository = new StadtRepository(stadtList);

        for(Stadt stadt: stadtRepository.getStadtRepository())
        {
            System.out.println(stadt.getLand());
        }

        for(Stadt stadt: stadtRepository.getStadtRepository())
        {
            stadt.setLand("Frankreich");
        }

        for(Stadt stadt: stadtRepository.getStadtRepository())
        {
            System.out.println(stadt.getLand());
        }

        Stadt stadt2 = new Stadt("n1","K2",temperaturList);
        stadtRepository.add_Temperatur(stadt2,temperatur1);

        for(Stadt stadt: stadtRepository.getStadtRepository())
        {
            System.out.println(stadt.getLand());
        }
    }
}
