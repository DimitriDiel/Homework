package lesson35.task2;

import lesson28.carShowroom.service.util.UserInput;

import java.io.*;

public class Task2 {

    //2) Копирование содержимого одного файла в другой
    //   Описание: Написать программу на Java, которая будет копировать содержимое одного
    //   текстового файла в другой, используя классы FileReader, FileWriter и BufferedReader.
    //   Пользователь должен иметь возможность указать исходный и целевой файлы в качестве аргументов.
    public static void main(String[] args) throws IOException {


        String input = UserInput.getText("Укажите путь к исходному файлу");

        String output = UserInput.getText("Укажите путь к целевому файлу");

        FileReader reader = new FileReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);
        FileWriter writer = new FileWriter(output);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line + "\n");

        }

        reader.close();
        bufferedWriter.close();
    }
}
