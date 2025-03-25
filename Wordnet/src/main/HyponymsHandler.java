package main;

import browser.NgordnetQuery;
import browser.NgordnetQueryHandler;
import ngrams.NGramMap;
import ngrams.TimeSeries;
import wordnet.WordNet;

import java.util.*;

public class HyponymsHandler extends NgordnetQueryHandler {
    private WordNet wordnet;
    private NGramMap ngm;

    public HyponymsHandler(String synsetsFile, String hyponymsFile, String wordsFile, String countsFile) {
        this.wordnet = new WordNet(synsetsFile, hyponymsFile);
        this.ngm = new NGramMap(wordsFile, countsFile);
    }

    @Override
    public String handle(NgordnetQuery q) {
        Set<String> words = new HashSet<>(q.words());
        int k = q.k();
        int startYear = q.startYear();
        int endYear = q.endYear();
        Set<String> hyponyms = wordnet.hyponyms(words);

        if (k == 0) {
            List<String> sorted = new ArrayList<>(hyponyms);
            Collections.sort(sorted);
            return sorted.toString();
        }

        Map<String, Double> countMap = new HashMap<>();
        for (String hyponym : hyponyms) {
            TimeSeries ts = ngm.countHistory(hyponym, startYear, endYear);
            double total = 0;
            for (double value : ts.values()) {
                total += value;
            }
            if (total > 0) {
                countMap.put(hyponym, total);
            }
        }

        if (countMap.isEmpty()) {
            return "[]";
        }

        List<String> hypCounts = new ArrayList<>(countMap.keySet());
        Collections.sort(hypCounts, new FrequencyComparator(countMap));

        List<String> topK = new ArrayList<>();
        for (int i = 0; i < Math.min(k, hypCounts.size()); i++) {
            topK.add(hypCounts.get(i));
        }

        Collections.sort(topK);
        return topK.toString();
    }

    private static class FrequencyComparator implements Comparator<String> {
        private Map<String, Double> countMap;

        public FrequencyComparator(Map<String, Double> countMap) {
            this.countMap = countMap;
        }

        @Override
        public int compare(String o1, String o2) {
            double count1 = countMap.get(o1);
            double count2 = countMap.get(o2);

            if (count1 > count2) {
                return -1;
            } else if (count1 < count2) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        }
    }
}
