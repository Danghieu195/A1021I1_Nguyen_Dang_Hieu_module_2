package _16_IO_Text_File.Thuc_hanh.Tim_gia_tri_lon_nhat_va_ghi_ra_file;

import _13_Search_Algorithms.Bai_tap.Tim_chuoi_tang_dan_co_do_dai_lon_nhat.Main;
import com.sun.media.sound.ModelMappedInstrument;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    static Scanner sc = new Scanner(System.in);

    static List<Integer> numberList = new ArrayList<>();

    public void writeFile(String filePath) {
        try {
            // Tạo một file csv
            File file = new File(filePath);
            file.createNewFile();

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Bạn muốn nhập bao nhiêu số?");
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.println("Mời bạn nhập số thứ " + (i + 1) + " :");
                int num = Integer.parseInt(sc.nextLine());
                numberList.add(num);
            }

            bufferedWriter.write(numberList.toString());
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFile(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);

            // Đọc từng dòng ( line ) trong file
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            // In ra từng dòng trong file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

            int max = numberList.get(0);

        for (int i = 1; i < numberList.size(); i++) {
            if (max < numberList.get(i)) {
                max = numberList.get(i);
            }
        }

            System.out.println("Số lớn nhất trong file bạn vừa nhập là: " + max);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static int findMaxValue (List<Integer> numbers) {
//
//        int max = numbers.get(0);
//
//        for (int i = 1; i < numbers.size(); i++) {
//            if (max < numbers.get(i)) {
//                max = numbers.get(i);
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();

        System.out.println("Mời bạn nhập đường dẫn: ");
        String path = sc.nextLine();
        readFile.writeFile(path);
        readFile.readFile(path);


    }
}
