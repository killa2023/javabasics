package org.example;

public class getMaxWords {

    public static class MaximumWordsInSentence {
        public static int searchMaximumWords(String[] sentences) {
            int maxWords = 0;

            for (String sentence : sentences) {
                String[] words = sentence.split(" ");
                int numWords = words.length;

                if (numWords > maxWords) {
                    maxWords = numWords;
                }
            }

            return maxWords;
        }

        public static void main(String[] args) {
            String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
            int numWords = searchMaximumWords(sentences);
            System.out.println("Maximum number of words in a single sentence: " + numWords);
        }
    }

}
