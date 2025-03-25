package wordnet;

import java.util.*;
import edu.princeton.cs.algs4.In;

public class WordNet {
    private DirectedGraph graph;
    private Map<String, Set<Integer>> wordToIds;
    private Map<Integer, Set<String>> idToWords;

    public WordNet(String synsetsFile, String hyponymsFile) {
        graph = new DirectedGraph();
        wordToIds = new HashMap<>();
        idToWords = new HashMap<>();

        In inSyn = new In(synsetsFile);
        while (inSyn.hasNextLine()) {
            String line = inSyn.readLine();
            String [] parts = line.split(",", 3);
            int id = Integer.parseInt(parts[0]);
            String[] words = parts[1].split(" ");

            Set<String> wordSet = new HashSet<>();
            for (String word : words) {
                wordSet.add(word);

                if(!wordToIds.containsKey(word)) {
                    wordToIds.put(word, new HashSet<>());
                }
                wordToIds.get(word).add(id);
            }
            idToWords.put(id, wordSet);
        }

        In inHyp = new In(hyponymsFile);
        while (inHyp.hasNextLine()) {
            String line = inHyp.readLine();
            String [] parts = line.split(",");
            int from = Integer.parseInt(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                int to = Integer.parseInt(parts[i]);
                graph.addEdge(from, to);
            }
        }
    }

    public Set<String> hyponyms(String word) {
        Set<Integer> ids = wordToIds.get(word);
        if (ids == null) {
            return new HashSet<>();
        }
        Set<Integer> descendants = graph.descendants(ids);
        Set<String> result = new HashSet<>();
        for (int id : descendants) {
            if (idToWords.containsKey(id)) {
                result.addAll(idToWords.get(id));
            }
        }
        return result;
    }

    public Set<String> hyponyms(Set<String> words) {
        Set<String> result = null;
        for(String word : words) {
            Set<String> hyp = hyponyms(word);
            if (result == null) {
                result = new HashSet<>(hyp);
            } else {
                Set<String> temp = new HashSet<>();
                for (String s : result) {
                    if (hyp.contains(s)) {
                        temp.add(s);
                    }
                }
                result = temp;
            }
        }
        if(result == null) {
            return new HashSet<>();
        }
        return result;
    }
}
