package lesson35.task2;

import java.io.*;

public class Task2 {

    //2) Копирование содержимого одного файла в другой
    //   Описание: Написать программу на Java, которая будет копировать содержимое одного
    //   текстового файла в другой, используя классы FileReader, FileWriter и BufferedReader.
    //   Пользователь должен иметь возможность указать исходный и целевой файлы в качестве аргументов.
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("src/lesson35/task1/test.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        FileWriter writer = new FileWriter("src/lesson35/task2/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line + "\n");

        }

        reader.close();
        bufferedWriter.close();
    }
}
