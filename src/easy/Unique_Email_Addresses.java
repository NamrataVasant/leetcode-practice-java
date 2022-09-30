package easy;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Addresses {

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com",
                            "test.e.mail+bob.cathy@leetcode.com",
                            "testemail+david@lee.tcode.com" };
        System.out.println("Number of unique emails: " + numUniqueEmails(emails));
    }

    private static int numUniqueEmails(String[] emails) {
        Set<String> uniqueLocalNames = new HashSet<>();
        for (String email : emails) {
            String key = applyRule(email);
            uniqueLocalNames.add(key);
        }
        return uniqueLocalNames.size();
    }

    private static String applyRule(String email) {
        int indexOfAt = email.indexOf('@');
        int indexOfPlus = email.indexOf('+');
        return email.substring(0, (indexOfPlus > 0 && indexOfPlus < indexOfAt) ? indexOfPlus: indexOfAt).replaceAll("\\.", "") + email.substring(indexOfAt);
    }
}
