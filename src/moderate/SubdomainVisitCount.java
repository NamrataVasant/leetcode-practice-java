package moderate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

    public static void main(String[] args) {
        String[] cpdomains = { "900 google.mail.com",
                          "50 yahoo.com",
                          "1 intel.mail.com",
                          "5 wiki.org" };
        List<String> subdomainVisitsList = subdomainVisits(cpdomains);
        System.out.println("Subdomain visits:");
        for (String subdomainVisit: subdomainVisitsList) {
            System.out.println(subdomainVisit);
        }
    }

    private static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> countPairs = new HashMap<>();
        List<String> subdomainVisitsCount = new ArrayList<>();

        for (String cpdomain : cpdomains) {
            String[] values = cpdomain.split(" ");
            int count = Integer.parseInt(values[0]);
            String[] domains = values[1].split("\\.");
            String domainName = "";
            for (int i = domains.length-1; i >= 0; i--) {
                domainName = domains[i] + domainName;
                countPairs.put(domainName, countPairs.getOrDefault(domainName, 0) + count);
                domainName = "." + domainName ;
            }
        }

        for (Map.Entry<String, Integer> countPair : countPairs.entrySet()) {
            subdomainVisitsCount.add(countPair.getValue() + " " + countPair.getKey());
        }

        return subdomainVisitsCount;
    }
}
