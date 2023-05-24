import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int number_doc = 0;
        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (fileExists && !isDirectory){
                number_doc +=1;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + number_doc);
                continue;}

            if (fileExists && isDirectory) {
                System.out.println("Указанный путь является путем к папке, а не к файлу, попробуйте снова: ");
            }

            else  {
                System.out.println("Файла не существует, попробуйте снова: ");
                }
        }
    }
}