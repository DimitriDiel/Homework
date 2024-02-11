package lesson35.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    /*
    3) Чтение данных из CSV файла и обработка их
    Описание: Написать программу на Java, которая будет читать данные из CSV (Comma-Separated Values)
    файла, используя классы FileReader и BufferedReader, и обрабатывать их.
    Программа должна способна разбирать строки из файла на поля, разделенные запятыми,
    и выполнять определенные операции на данных, такие как суммирование, поиск определенных значений и т.д.
     */
    public static void main(String[] args) throws IOException {


        FileReader reader = new FileReader("src/lesson35/task3/username.csv");
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<User> users = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            try {
                String userName = line.split(";")[0];
                int identifier = Integer.parseInt(line.split(";")[1]);
                String firstName = line.split(";")[2];
                String lastName = line.split(";")[3];

                users.add(new User(userName, identifier, firstName, lastName));
            } catch (Exception e){
                System.out.println(e.getMessage());

            }
        }
        reader.close();

        System.out.println(users);

        //суммирование
        String firstNameLastName = users.get(0).getFirstName() + " " +users.get(0).getLastName();

        System.out.println(firstNameLastName);

        // поиск

        List<User> result = users.stream()
                .filter(User -> User.getIdentifier() == 9346)
                .toList();

        System.out.println(result);



    }
}
