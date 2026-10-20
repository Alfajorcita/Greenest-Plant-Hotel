import java.util.ArrayList;
import java.util.List;

public class PlantHotel {
    //inkapsling
    private List<Plant> plantList = new ArrayList<>();

    public PlantHotel() {
        //Polimorfysm. olika växter ärver från den abstrakta klassen Plants. Samma anrop, olika beteende.
        plantList.add(new Palm("Laura", 5));
        plantList.add(new Palm("Olof", 1));
        plantList.add(new Cactus("Igge", 0.2));
        plantList.add(new CarnivorousPlant("Meatloaf", 0.7));
    }

    public Plant findByName(String name) {

        for (Plant plant : plantList) {
            if (plant.getName().equalsIgnoreCase(name.trim())) {
                return plant;
            }
        }
        return null;
    }
}


