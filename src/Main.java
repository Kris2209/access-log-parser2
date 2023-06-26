import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int count = 0;
        int number_doc = 0;
        int stringSum = 0;
        int googleBotCount = 0;
        int yandexBotCount = 0;

        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (fileExists && !isDirectory){
                number_doc +=1;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + number_doc);
                try {
                    FileReader fileReader = new FileReader(path);
                    BufferedReader reader =
                            new BufferedReader(fileReader);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        int length = line.length();
                        if(length>1024) throw new ExceededTheLimit("Количество символов в строке не должно превышать 1024");
                        stringSum+=1;

                    char bracket = '"';
                    int[] bracketIndices = new int[6];
                    bracketIndices[0] = line.indexOf(bracket);
                    bracketIndices[1] = line.indexOf(bracket, bracketIndices[0] + 1);
                    bracketIndices[2] = line.indexOf(bracket, bracketIndices[1] + 1);
                    bracketIndices[3] = line.indexOf(bracket, bracketIndices[2] + 1);
                    bracketIndices[4] = line.indexOf(bracket, bracketIndices[3] + 1);
                    bracketIndices[5] = line.indexOf(bracket, bracketIndices[4] + 1);

                    String thirdBrackets = line.substring(bracketIndices[4], bracketIndices[5]);

                    String[] parts = thirdBrackets.split(";");
                    for (int i = 0; i < parts.length; i++) {
                        parts[i] = parts[i].trim();}

                    if (parts.length >= 2) {
                        String fragment = parts[1];

                        int slashIndex = fragment.indexOf('/');
                        if (slashIndex > 0) {
                            String bot = fragment.substring(0, slashIndex);
                            if (bot.equalsIgnoreCase("Googlebot")) {
                                googleBotCount++;
                            } else if (bot.equalsIgnoreCase("YandexBot")) {
                                yandexBotCount++;
                            }
                        }}

                }}
                catch(Exception ex){
                    ex.printStackTrace();
                }
                System.out.println("Количество строк: " + stringSum);
                System.out.println("Запросов от Google: " + googleBotCount + " (" + ((double)googleBotCount / (double)stringSum * 100.0) + "%)");
                System.out.println("Запросов от Yandex: " + yandexBotCount + " (" + (double)yandexBotCount / (double)stringSum * 100.0 + "%)");

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