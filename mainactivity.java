import java.util.Scanner;

public class MainActivity {

    static String[] songs = {
            "Song 1",
            "Song 2",
            "Song 3"
    };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("🎵 Welcome to MusicBox");

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i]);
        }

        System.out.print("Select a song number: ");
        int choice = input.nextInt();

        if (choice >= 1 && choice <= songs.length) {
            System.out.println("Now Playing: " + songs[choice - 1]);
        } else {
            System.out.println("Invalid selection");
        }
    }
}
