package Luyen_tap_them.Bai_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateManager {
    Scanner sc = new Scanner(System.in);

    private List<Candidate> candidateList;

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public CandidateManager() {
        candidateList = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        candidateList.add(candidate);

    }

    public void displayCandidate(List<Candidate> candidateList) {
        System.out.println("Candidates with a total score of over 25 are: ");
        for ( Candidate candidate : candidateList) {
            if (candidate.getSum() > 25) {
                System.out.println(candidate);
            }

        }
    }
}
