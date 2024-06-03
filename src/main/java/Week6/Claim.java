package Week6;

// Claim class for demonstration purposes
class Claim {
    // Example fields
    private String patientId;
    private double claimAmount;
    private boolean valid;

    // Example method to check if claim is valid
    public boolean isValid() {
        // Implement validity checks
        return true; // Assume claim is valid
    }

    // Getters and setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }
}
