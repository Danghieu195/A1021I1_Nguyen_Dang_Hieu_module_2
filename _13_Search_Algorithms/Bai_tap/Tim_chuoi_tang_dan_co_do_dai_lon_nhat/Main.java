package _13_Search_Algorithms.Bai_tap.Tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import javax.security.sasl.SaslClient;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentense: ");

        String sentences = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Tim chuoi tang dan co do dai lon nhat
        for (int i = 0; i < sentences.length(); i++) { // Vong lap ben ngoai
            // Khai bao 1 linked list trung gian cac ki tu cua chuoi tang dan
            LinkedList<Character> list = new LinkedList<>();
            // Them ki tu i vao trong list
            list.add(sentences.charAt(i));

            for (int j = i + 1; j < sentences.length(); j++) { // Vong lap ben trong
                // Kiem tra ki tu tiep theo co lon hon ki tu cuoi cung trong list hay khong
                if ( sentences.charAt(j) > list.getLast()) {
                    // Neu co thi them vao trong list
                    list.add(sentences.charAt(j));
                }
            }
            // So sanh kich co cua list trung gian va list chua chuoi tang dan co kich thuoc lon nhat.
            if ( list.size() > max.size() ){
                // Neu kich co cua list trung gian lon hon kich co cua list co do dai lon nhat thi gan la max.
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Hien thi chuoi tang dan dai nhat
        for (Character ch : max) {
            System.out.println(ch);
        }
        System.out.println();
    }
}
