package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        Issue issue1 = new Issue("First", 1);
        Issue issue2 = new Issue("Second", 2);
        Issue issue3 = new Issue("Third", 3);
        Issue issue4 = new Issue("Fourth", 4);
        Issue issue5 = new Issue("Fifth", 5);
        issues.add(issue1);
        issues.add(issue2);
        issues.add(issue3);
        issues.add(issue4);
        issues.add(issue5);
    }
    public void showMostUrgent() {
        // TODO: Show most urgent issues
        System.out.println(issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        issues.poll();
        issues.poll();
        System.out.println("Removed...");
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        Iterator<Issue> it =  issues.iterator();
        while(it.hasNext()) {
            String currentIssues = it.toString();
            System.out.println(currentIssues);
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
        System.out.println("Added...");
    }
}
