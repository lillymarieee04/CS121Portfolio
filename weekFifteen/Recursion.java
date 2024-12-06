package weekFifteen;

public class Recursion {
    public void countDown(int number) {
        if (number == 0) {
            System.out.println("Blast Off!");
            return;
        }

        System.out.println(number);
        countDown(number - 1);
    }

    public void alphaBackwards(char letter) {
        if (letter == 'a') {
            System.out.println(letter);
            return;
        }

        System.out.println(letter);
        alphaBackwards((char) (letter - 1));
    }

}