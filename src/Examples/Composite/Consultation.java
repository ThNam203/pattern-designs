package Examples.Composite;

class Consultation implements MedicalService {
    @Override
    public String getDescription() {
        return "Consultation";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}