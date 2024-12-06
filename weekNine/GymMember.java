package weekNine;

public class GymMember {
    private String name;
    private String membershipType;
    private String confirmationNumber;

    public GymMember(String name, String membershipType, String confirmationNumber) {
        this.name = name;
        this.membershipType = membershipType;
        this.confirmationNumber = confirmationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Membership Type: " + membershipType + ", Confirmation Number: " + confirmationNumber;
    }
}

