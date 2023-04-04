package fileIo;
import java.io.File;
import java.io.IOException;
public class DemostrateFileOperations {

        public void createFile() throws IOException {
            File f = new File("C:\\Users\\chegi\\IdeaProjects\\Ashu.csv");
            f.createNewFile();
            System.out.println(f.exists());
        }
        public void createDirectory() throws IOException {
            File f = new File("C:\\Users\\chegi\\IdeaProjects\\Ashu.csv");
            f.mkdir();
            System.out.println(f.exists());
        }
        public void createFiles() throws IOException {
            for (int startNo = 12; startNo < 51; startNo++) {
                File f = new File("C:\\Users\\chegi\\IdeaProjects\\Ashu + " + startNo + ".csv");
                f.createNewFile();
            }
        }
        public void checkFiles() {
            File f = new File("C:\\Users\\chegi\\IdeaProjects\\Ashu.csv");
            String[] listFiles = f.list();
            for (String str : listFiles) {
                System.out.println(str);
            }
        }


        public static void main(String[] args) throws IOException {
            DemostrateFileOperations file = new DemostrateFileOperations();
            file.createFile();
            file.createFiles();
            file.checkFiles();
            file.createDirectory();
        }
    }

