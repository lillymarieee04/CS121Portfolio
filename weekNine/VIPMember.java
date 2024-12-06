package weekNine;

public class VIPMember extends GymMember {
    // Additional attribute for VIP members
    private String vipCardNumber;

    // Constructor
    public VIPMember(String name, String membershipType, String confirmationNumber, String vipCardNumber) {
        // Call the constructor of the superclass (GymMember)
        super(name, membershipType, confirmationNumber);
        this.vipCardNumber = vipCardNumber;
    }

    // Getter for vipCardNumber
    public String getVipCardNumber() {
        return vipCardNumber;
    }

    // Setter for vipCardNumber
    public void setVipCardNumber(String vipCardNumber) {
        this.vipCardNumber = vipCardNumber;
    }

    // Override the toString method to include VIP member details
    @Override
    public String toString() {
        return super.toString() + ", VIP Card Number: " + vipCardNumber;
    }
}
