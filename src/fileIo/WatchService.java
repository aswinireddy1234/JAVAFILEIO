package fileIo;
import java.nio.file.*;
public class WatchService {

        public static void main(String[] args) throws Exception {
            Path directoryPath = Paths.get("/path/to/directory");

            WatchService watcherServices = (WatchService) FileSystems.getDefault().newWatchService();

            directoryPath.register((java.nio.file.WatchService) watcherServices, (WatchEvent.Kind<?>) StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

            while (true) {
                WatchKey key = ((java.nio.file.WatchService) watcherServices).take();
                for (WatchEvent<?> event : key.pollEvents()) {

                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                        System.out.println("File created: " + event.context().toString());
                    } else if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                        System.out.println("File deleted: " + event.context().toString());
                    } else if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                        System.out.println("File modified: " + event.context().toString());
                    }
                }

                key.reset();
         }
     }

 }

