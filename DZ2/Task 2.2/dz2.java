//Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл
//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dz2 {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {

        try {
            Logger logger = Logger.getAnonymousLogger();
            FileHandler fileHandler = new FileHandler("DZ2/Task 2.2/log.txt", true);
            logger.addHandler(fileHandler);

            try {
                log = new File("DZ2/Task 2.2/result.txt");
                log.createNewFile();
                fileWriter = new FileWriter(log, false);
                int[] arr = { 7, 18, 34, 96, 8, 27, 58, 85 };
                bubbleSort(arr);
                fileWriter.close();
                logger.log(Level.INFO, "Числовой массив отсортирован");

            } catch (Exception e) {
                e.printStackTrace();
                logger.log(Level.WARNING, e.getMessage());
            }
            fileHandler.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private static int[] bubbleSort(int[] arr) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }

            logStep(Arrays.toString(arr));
        }
        return arr;
    }

    public static void logStep(String note) {
        try {
            fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
            System.out.println(e.getMessage());
        }
    }
}
