package _16_IO_Text_File.Thuc_hanh.Tinh_tong_cac_so_trong_file_text;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    Scanner sc = new Scanner(System.in);

    public void readSumNumberFileText(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            System.out.println(" File không tồn tại hoặc file bị lỗi");
        }
    }

    public void writeFileText(String filePath) {
        try {
            File file = new File(filePath);
            file.createNewFile();

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Bạn muốn nhập bao nhiêu số nguyên?");
            int input = Integer.parseInt(sc.nextLine());
            int i = 0;
            String number;
            while (i < input) {
                System.out.println("Mời bạn nhập số thứ " + (i + 1) + " : ");
                number = sc.nextLine();
                bufferedWriter.write(number);
                bufferedWriter.newLine();
                i++;
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào đường dẫn file: ");
        String path = sc.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.writeFileText(path);
        readFileExample.readSumNumberFileText(path);
    }
}
