package _16_IO_Text_File.Bai_tap.Bai_1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Character> readFile( String filePath) {
        List<Character> chars = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
                BufferedReader bufferedReader = new BufferedReader( new FileReader(file));
                int charByAscii = bufferedReader.read();

                while (charByAscii != -1) {
                    chars.add((char)charByAscii);
                    charByAscii = bufferedReader.read();
                }
                bufferedReader.close();

        } catch (Exception e) {
            System.out.println("File does not exist or error!");
        }

        return chars;
    }

    public static void writeFile(String filePath, String destPath, int countChar) {
        try {
            List<Character> chars = readFile(filePath);
            char[] result = new char[chars.size()];

            for (int i = 0; i < result.length; i++) {
                result[i] = chars.get(i);
            }

            FileWriter writer = new FileWriter(destPath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(result,0,result.length);
            bufferedWriter.write("\nThe number of chars in source file is " + countChar);
            bufferedWriter.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
