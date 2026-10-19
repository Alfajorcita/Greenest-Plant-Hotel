import java.util.ArrayList;
import java.util.List;

public class PlantHotel {

    private List<Plants> plantList = new ArrayList<>();

    public PlantHotel() {
        plantList.add(new Palm("Laura", 5));
        plantList.add(new Palm("Olof", 1));
        plantList.add(new Cactus("Igge", 0));
        plantList.add(new CarnivorousPlant("Meatloaf", 0.7));
    }

    public void showPlants() {
        for (Plants plant : plantList) {
            System.out.print(plant.getName() + " | ");
        }
        System.out.print("\n");

    }

    public Plants findByName(String name) {

        for (Plants plant : plantList) {
            if (plant.getName().equalsIgnoreCase(name.trim())) {
                return plant;
            }
        }

        return null;
    }
}


