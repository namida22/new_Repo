package sample;

import java.util.ArrayList;
import java.util.List;

public class StadtRepository {

    public static List<Stadt> stadtRepository;

    public StadtRepository(List<Stadt> stadtList)
    {
        stadtRepository = stadtList;
    }

    public List<Stadt> getStadtRepository() {
        return stadtRepository;
    }

    public void setStadtRepository(List<Stadt> stadtRepository) {
        StadtRepository.stadtRepository = stadtRepository;
    }

    public void add_Temperatur(Stadt stadt, Temperatur temperatur)
    {
        int temperatur_gefunden = 0;
        int stadt_gefunden = 0;
        for(Stadt stadt_iterator : stadtRepository)
            if(stadt_iterator.getName().equals(stadt.getName())) {
                stadt_gefunden = 1;
                break;
            }
        if(stadt_gefunden==0)
        {
            stadtRepository.add(stadt);

        }
        else
        {
            for(Stadt stadt_iterator : stadtRepository)
                if(stadt_iterator.getName().equals(stadt.getName())) {
                    for (Temperatur temperatur_iterator : stadt_iterator.getTemperaturList()) {
                        for (Temperatur temperatur_iterator2 : stadt.getTemperaturList())

                            if (temperatur_iterator.getMonat() == temperatur_iterator2.getMonat()) {
                                temperatur_gefunden = 1;
                                break;
                            }
                    }
                }
            if(temperatur_gefunden == 0)
            {
                for(Stadt stadt_iterator : stadtRepository)
                    if(stadt_iterator.getName().equals(stadt.getName())) {
                        stadt_iterator.getTemperaturList().add(temperatur);
                    }
            }
            else
            {
                for(Stadt stadt_iterator : stadtRepository)
                { if(stadt_iterator.getName().equals(stadt.getName())) {
                    for (Temperatur temperatur_iterator : stadt_iterator.getTemperaturList()) {
                        for (Temperatur temperatur_iterator2 : stadt.getTemperaturList())

                            if (temperatur_iterator.getMonat() == temperatur_iterator2.getMonat()) {
                                //temperatur
                                break;
                            }
                    }
                }
                }
            }
        }


    }

}
