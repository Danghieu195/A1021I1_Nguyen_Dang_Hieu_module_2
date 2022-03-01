package _16_IO_Text_File.Bai_tap.Bai_1;

import java.util.List;
import java.util.Scanner;

public class CopyTextFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String sourcePath = sc.nextLine();

        System.out.println("Enter destination path: ");
        String destPath = sc.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        List<Character> chars = readAndWriteFile.readFile(sourcePath);
        int countChar = getNumberOfChars(chars);
        readAndWriteFile.writeFile(sourcePath,destPath,countChar);
    }

    private static int getNumberOfChars(List<Character> chars) {
        int countChar = chars.size();
        return countChar;
    }

}
