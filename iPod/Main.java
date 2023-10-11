import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Welcome -- iPod turning on!\n");

        playing(0); // starting song
        
        sc.close();
    }

    static void playing(int num) {
        ipod ipod = new ipod();
        System.out.println("Now Playing : " + ipod.songs[num]);
        System.out.print("Enter an action(off, skip, shuffle): ");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
            switch (sc.nextLine()) {
                case "skip":
                if (num == (ipod.songs.length-1)) {
                    playing(0);
                } else {
                    playing(num+1);
                    break;
                }
                case "shuffle":
                    playing(rand.nextInt(ipod.songs.length));
                    break;
                case "off":
                    System.out.println("Turning ipod off -- Goodbye!\n");
                    sc.close();
                    break;
            }
    }
}
