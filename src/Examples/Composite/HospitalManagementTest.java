package Examples.Composite;

public class HospitalManagementTest {
    public static void main(String[] args) {
        MedicalService consultation = new Consultation();
        MedicalService xRay = new XRay();
        MedicalService surgery = new Surgery();

        System.out.println(consultation.getDescription() + ": $" + consultation.getCost());
        System.out.println(xRay.getDescription() + ": $" + xRay.getCost());
        System.out.println(surgery.getDescription() + ": $" + surgery.getCost());

        CompositeMedicalService healthCheckPackage = new CompositeMedicalService();
        healthCheckPackage.addService(consultation);
        healthCheckPackage.addService(xRay);
        
        System.out.println("\nHealth Check Package:");
        System.out.println(healthCheckPackage.getDescription() + "Total Cost: $" + healthCheckPackage.getCost());

        healthCheckPackage.addService(surgery);

        System.out.println("\nFull Health Care Package:");
        System.out.println(healthCheckPackage.getDescription() + "Total Cost: $" + healthCheckPackage.getCost());
    }
}