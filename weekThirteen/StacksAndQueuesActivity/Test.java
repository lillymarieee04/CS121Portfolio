package weekThirteen.StacksAndQueuesActivity;

public class Test {
    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println("Testing ValidParenthesis:");
        System.out.println("Input: \"()\" - " + vp.isValid("()"));
        System.out.println("Input: \"()[]{}\" - " + vp.isValid("()[]{}"));
        System.out.println("Input: \"(]\" - " + vp.isValid("(]"));
        System.out.println("Input: \"([)]\" - " + vp.isValid("([)]"));
        System.out.println("Input: \"{[]}\" - " + vp.isValid("{[]}"));

        RecentCounter rc = new RecentCounter();
        System.out.println("\nTesting RecentCounter:");
        System.out.println("Ping at 1: " + rc.ping(1));
        System.out.println("Ping at 100: " + rc.ping(100));
        System.out.println("Ping at 3001: " + rc.ping(3001));
        System.out.println("Ping at 3002: " + rc.ping(3002));
    }
}
