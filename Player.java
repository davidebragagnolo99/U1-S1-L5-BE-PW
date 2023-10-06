import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il nome e la durata di una canzone: ");
        Audio canzone1 = new Audio(input.nextLine(), input.nextInt());
        input.nextLine();
        System.out.println("Inserisci il nome e la durata di un film: ");
        Video video1 = new Video(input.nextLine(), input.nextInt());
        input.nextLine();
        System.out.println("Inserisci il titolo e la luminosità di un'immagine: ");
        Immagine img1 = new Immagine(input.nextLine(), input.nextInt());
        input.nextLine();
        System.out.println("Inserisci il titolo di un film e la sua durata: ");
        Video video2 = new Video(input.nextLine(), input.nextInt());
        input.nextLine();
        System.out.println("Inserisci il titolo di una canzone e la sua durata: ");
        Audio canzone2 = new Audio(input.nextLine(), input.nextInt());
        input.nextLine();
        Object [] playerMemory = { canzone1, video1, img1, video2, canzone2 };
        int selectedMedia = -1;
        while (selectedMedia != 0) {
            System.out.println("Digita da 1 a 5 per mettere in play oppure digita 0 per chiudere.");
            selectedMedia = input.nextInt();
        }
    }
}
