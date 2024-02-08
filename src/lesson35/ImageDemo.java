package lesson35;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageDemo {

    public static void main(String[] args) throws IOException {

        String sourcePath = "src/lesson35/file.jpg";
        String destinationPath = "src/lesson35/file1.jpg";

        FileInputStream input = new FileInputStream(sourcePath);

        FileOutputStream output = new FileOutputStream(destinationPath);


        int byteRead;
        while ((byteRead = input.read()) != -1) {
            output.write(byteRead);
        }

        System.out.println("Файл успешно скопирован.");


    }
}
