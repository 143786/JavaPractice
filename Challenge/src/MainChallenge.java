public class MainChallenge {


public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024; // Convert to megabytes
            int remainingKiloBytes = kiloBytes % 1024; // Remaining kilobytes

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        // Example usage
        printMegaBytesAndKiloBytes(2500); // Expected: 2500 KB = 2 MB and 452 KB
        printMegaBytesAndKiloBytes(-1024); // Expected: Invalid Value
        printMegaBytesAndKiloBytes(1024); // Expected: 1024 KB = 1 MB and 0 KB
    }
}
