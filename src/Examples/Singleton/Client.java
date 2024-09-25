package Examples.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        // simulate multiple users access to a single instance
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // add and update records concurrently
        for (int i = 0; i < 100; i++) {
            final int recordId = i;
            executorService.submit(() -> {
                PatientManager manager = PatientManager.getInstance();

                PatientRecord record = new PatientRecord("ID-" + recordId, "Patient-" + recordId, 30 + recordId);
                manager.addPatientRecord(record); // Simulate adding patient records

                PatientRecord updatedRecord = new PatientRecord("ID-" + recordId, "Patient-" + recordId + "-Updated", 31 + recordId);
                manager.updatePatientRecord("ID-" + recordId, updatedRecord);
            });
        }

        executorService.shutdown();

        // Print out the final patient records to verify the updates
        for (int i = 0; i < 100; i++) {
            PatientManager manager = PatientManager.getInstance();

            PatientRecord record = manager.getPatientRecord("ID-" + i);
            System.out.println("Final record: " + record.getName() + ", Age: " + record.getAge());
        }
    }
}
