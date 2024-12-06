package weekNine;

public class GymMemberMain {
    public static void main(String[] args) {
        GymMember regularMember = new RegularMember("Jane Doe", "Regular", "RM12345", 28);

        GymMember vipMember = new VIPMember("John Smith", "VIP", "VIP67890", "VIP9876");

        System.out.println(regularMember.toString());
        System.out.println(vipMember.toString());
    }
}