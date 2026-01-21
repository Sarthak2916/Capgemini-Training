package feature_21_1_26.encapsulation_polymorphism_interface_abstractclass;

import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;

    private String diagnosis;
    private List<String> medicalHistory;

    protected Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<>();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void updateDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMaskedDiagnosis() {
        if (diagnosis == null || diagnosis.isEmpty()) return "Not Available";
        return "Confidential";
    }

    @Override
    public void addRecord(String record) {
        if (record != null && !record.trim().isEmpty()) {
            medicalHistory.add(record);
        }
    }

    @Override
    public void viewRecords() {
        if (medicalHistory.isEmpty()) {
            System.out.println("No medical records found.");
            return;
        }
        for (int i = 0; i < medicalHistory.size(); i++) {
            System.out.println((i + 1) + ". " + medicalHistory.get(i));
        }
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId +
                "\nName: " + name +
                "\nAge: " + age +
                "\nDiagnosis: " + getMaskedDiagnosis();
    }
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;
    private double doctorFee;

    public InPatient(int patientId, String name, int age, String diagnosis,
                     int daysAdmitted, double dailyCharge, double doctorFee) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
        this.doctorFee = doctorFee;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    public double getDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(double dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    @Override
    public double calculateBill() {
        if (daysAdmitted <= 0) return doctorFee;
        return (daysAdmitted * dailyCharge) + doctorFee;
    }
}

class OutPatient extends Patient {
    private double consultationFee;
    private double testCharges;

    public OutPatient(int patientId, String name, int age, String diagnosis,
                      double consultationFee, double testCharges) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double getTestCharges() {
        return testCharges;
    }

    public void setTestCharges(double testCharges) {
        this.testCharges = testCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Sarthak", 20, "Fever", 4, 1500, 2000);
        Patient p2 = new OutPatient(102, "Rahul", 22, "Cold", 500, 800);

        p1.addRecord("Blood Test: Normal");
        p1.addRecord("Medicine: Paracetamol 650mg");

        p2.addRecord("Consultation Done");
        p2.addRecord("Prescribed: Cough Syrup");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Medical Records:");
            p.viewRecords();
            System.out.println("Total Bill: " + p.calculateBill());
        }
    }
}

