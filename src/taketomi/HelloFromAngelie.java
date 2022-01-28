package taketomi;

public class HelloFromAngelie {

    public void selfIntro() {
        System.out.println("Hello, my name is Angelie Taketomi.");
    }

    public void guestIntro(String guestName) {
        System.out.printf("Hello Angelie, my name is %s.%n", guestName);
    }

    public static void main(String[] args) {
        // write your code here
        HelloFromAngelie hello = new HelloFromAngelie();
        hello.selfIntro();
        hello.guestIntro("Matthew Bates");
    }
}
