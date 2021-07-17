package training.algorithms.strings;

public class CountVowelsAndCononants {
    public static void main(String[] args) {
        String c1 = "hello";
        NumberVowelsConsonants numberVowelsConsonants = countVowelsandConsonants(c1);
        System.out.println(numberVowelsConsonants.toString());
    }

    public static NumberVowelsConsonants countVowelsandConsonants(String c1) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int nbVowels = 0;
        int nbConsonants = 0;
        for (int i = 0; i < c1.length(); i++) {
            boolean containsVowels = containsLetter(vowels,  c1.charAt(i));
            if (containsVowels) {
                nbVowels = nbVowels + 1;
            } else {
                nbConsonants = nbConsonants + 1;
            }
        }

        NumberVowelsConsonants build = new NumberVowelsConsonants.Builder()
                .withCountConsonants(nbConsonants)
                .withCountVowels(nbVowels)
                .build();
        return build;
    }

    static boolean containsLetter(char[] charr, char c) {
        for (char v : charr) {
            if (c == v) {
                return true;
            }
        }
        return false;
    }


    static class NumberVowelsConsonants {
        private int countConsonants;
        private int countVowels;

        public NumberVowelsConsonants(int countConsonants, int countVowels) {
            this.countConsonants = countConsonants;
            this.countVowels = countVowels;
        }

        public int getCountConsonants() {
            return countConsonants;
        }

        public int getCountVowels() {
            return countVowels;
        }

        @Override
        public String toString() {
            return "Consonants Counts : " + countConsonants + ", Vowels Count : " + countVowels;
        }

        public static class Builder {
            private int countConsonants;
            private int countVowels;

            public Builder withCountConsonants(int countConsonants) {
                this.countConsonants = countConsonants;
                return this;
            }

            public Builder withCountVowels(int countVowels) {
                this.countVowels = countVowels;
                return this;
            }

            public NumberVowelsConsonants build() {
                return new NumberVowelsConsonants(countConsonants, countVowels);
            }

        }
    }
}
