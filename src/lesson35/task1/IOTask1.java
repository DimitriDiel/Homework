package lesson35.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOTask1 {

    // 1) Чтение данных из текстового файла и вывод на экран
    //   Описание: Написать программу на Java, которая будет читать данные из текстового файла,
    //   используя классы FileReader и BufferedReader, и выводить их на экран.

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("src/lesson35/task1/test.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }
        reader.close();

    }
}
