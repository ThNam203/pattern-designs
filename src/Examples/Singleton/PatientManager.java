package Examples.Singleton;

import java.util.concurrent.ConcurrentHashMap;

public class PatientManager {
    private static PatientManager instance;
    private final ConcurrentHashMap<String, PatientRecord> patientRecords;

    private PatientManager() {
        patientRecords = new ConcurrentHashMap<>();
    }

    public static synchronized PatientManager getInstance() {
        if (instance == null) {
            instance = new PatientManager();
        }

        return instance;
    }

    public void addPatientRecord(PatientRecord record) {
        patientRecords.put(record.getId(), record);
        System.out.println("Added patient record: " + record.getName());
    }

    public void updatePatientRecord(String id, PatientRecord updatedRecord) {
        if (patientRecords.containsKey(id)) {
            patientRecords.put(id, updatedRecord);
            System.out.println("Updated patient record: " + updatedRecord.getName());
        } else {
            System.out.println("Patient record not found.");
        }
    }

    public PatientRecord getPatientRecord(String id) {
        return patientRecords.get(id);
    }
}

