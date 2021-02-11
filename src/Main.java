import february.February;

public class Main {

    public static void main(String[] args) {
        February feb = new February();
        String revesedText = feb.reverseText("My name is John");
        System.out.println(revesedText);
    }
}
