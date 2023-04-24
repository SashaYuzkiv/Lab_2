import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        BetweenLetterSpacesRemover remover = new BetweenLetterSpacesRemover();
        String processedText = remover.removeNonLetterSpaces(text);

        System.out.println("Оригінальний текст: " + text);
        System.out.println("Замінений текст: " + processedText);
        System.out.println("Кількість замінених символів в тексті: " + processedText.split("\\s+").length);
    }
}