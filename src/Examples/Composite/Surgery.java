package Examples.Composite;

class Surgery implements MedicalService {
    @Override
    public String getDescription() {
        return "Surgery";
    }

    @Override
    public double getCost() {
        return 1500.0;
    }
}