package Luyen_tap_them.Bai_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Candidate candidate = new Candidate(101,"Hiếu", "19-05-1997", 8.5, 9, 6.5);
        Candidate candidate1= new Candidate(123,"Tuấn", "01-01-1996", 9.5, 8, 7.5);
        Candidate candidate2 = new Candidate(112,"Hà", "11-04-1997", 8, 9.75, 8.5);
        Candidate candidate3 = new Candidate(145,"Lâm", "17-10-1998", 7, 10, 9);

        CandidateManager candidateManager = new CandidateManager();

        List<Candidate> candidateList = candidateManager.getCandidateList();

        candidateManager.addCandidate(candidate);
        candidateManager.addCandidate(candidate1);
        candidateManager.addCandidate(candidate2);
        candidateManager.addCandidate(candidate3);

        candidateManager.displayCandidate(candidateList);
    }
}
