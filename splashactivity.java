public class SplashActivity {

    public static void main(String[] args) {

        System.out.println("Loading MusicBox...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Welcome to MusicBox");
    }
}
