package Examples.Composite;

import java.util.ArrayList;
import java.util.List;

class CompositeMedicalService implements MedicalService {
    private List<MedicalService> services = new ArrayList<>();

    public void addService(MedicalService service) {
        services.add(service);
    }

    public void removeService(MedicalService service) {
        services.remove(service);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Package includes: ");
        for (MedicalService service : services) {
            description.append(service.getDescription()).append(", ");
        }
        return description.toString();
    }

    @Override
    public double getCost() {
        double totalCost = 0.0;
        for (MedicalService service : services) {
            totalCost += service.getCost();
        }
        return totalCost;
    }
}