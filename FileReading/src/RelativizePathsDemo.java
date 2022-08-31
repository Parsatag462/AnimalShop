import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizePathsDemo {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:/Users/justi/OneDrive/Desktop/CD DevShop 22/Java Programming/IO/Logs/errorLogs.txt");
        Path p2 = Paths.get("C:/Users/justi/OneDrive/Desktop/CD DevShop 22/Java Programming/IO");
        Path p3 = p2.relativize(p1);
        System.out.println(p3);
    }
}
