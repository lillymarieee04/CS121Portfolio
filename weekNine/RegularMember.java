package weekNine;

public class RegularMember extends GymMember {
    // Additional attribute
    private int age;

    public RegularMember(String name, String membershipType, String confirmationNumber, int age) {
        super(name, membershipType, confirmationNumber);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}
