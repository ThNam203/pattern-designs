package Examples.Composite;

class XRay implements MedicalService {
    @Override
    public String getDescription() {
        return "X-Ray";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}