package strings;

public class Main {
/*
    main for Concatenate
        public static void main(String[] args) {
            String res = Concatenate.concatenate(new String[]{"ciao", "", "chiamo", "", "gabri"});
            System.out.println(res);
        }
*/
    /*main for reverse
    public static void main(String[] args) {
        String res = Reverse.reverseCharAt("tset gnirtS");
        System.out.println(res);
        res = Reverse.reverseStringBuilder("tset gnirtS");
        System.out.println(res);
        res = Reverse.reverseStringBuilder("tset gnirtS");
        System.out.println(res);
    }*/

    /*main RemoveFirstTwoChars
    public static void main(String[] args) {
        String s = RemoveFirstTwoChars.removeFirstTwoCharsCharAt("Hello world!");
        System.out.println(s);
        s = RemoveFirstTwoChars.removeFirstTwoCharsCharAt("No");
        System.out.println(s);
        s = RemoveFirstTwoChars.removeFirstTwoCharsCharAt("N");
        System.out.println(s);
        s = RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("Hello World");
        System.out.println(s);
        s = RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("No");
        System.out.println(s);
        s = RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("N");
        System.out.println(s);
    }*/
    /*main_good_at_the_beginning
    public static void main(String[] args) {
        boolean res = GoodAtTheBeginning.goodAtTheBeginning("good Sweet");
        System.out.println(res);
        res = GoodAtTheBeginning.goodAtTheBeginning(" good Sweet");
        System.out.println(res);
        GoodAtTheBeginning.goodAtTheBeginning("goo");
        System.out.println(res);
    }*/
    /*main RemoveFirstTowCharsIf
    public static void main(String[] args) {
        String s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Hello world!");
        System.out.println(s);
        s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("aeaklsjgoais");
        System.out.println(s);
        s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Hdllo world!");
        System.out.println(s);
        s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("llo world!");
        System.out.println(s);
        s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("");
        System.out.println(s);
        s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("aello world!");
        System.out.println(s);
        s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Hdllo world!");
        System.out.println(s);
        s = RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("llo world!");
        System.out.println(s);
    }*/
    /*
    main goodAroundTheBeginning
    public static void main(String[] args) {
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("good Sweet"));
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("_good Sweet"));
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("__good Sweet"));
        System.out.println(GoodAroundTheBeginning.goodAroundTheBeginning("goo"));
    }*/
   /* main DuplicateChars
    public static void main(String[] args) {
        System.out.println(DuplicateChars.duplicateChars("aaaaabbhadghdhsfguahfpz"));
        System.out.println(DuplicateChars.duplicateChars("ss"));
        System.out.println(DuplicateChars.duplicateChars("s"));
        System.out.println(DuplicateChars.duplicateChars(""));
    }*/

    /*main palindrome
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("whistleblower"));
        System.out.println(Palindrome.isPalindrome("radar"));
        System.out.println(Palindrome.isPalindrome("pabbap"));
        System.out.println(Palindrome.isPalindrome("r")); // true
        System.out.println(Palindrome.isPalindrome("")); // true
        System.out.println(Palindrome.isPalindrome("RaceCar")); // true
    }*/
    /*main CountYZ
    public static void main(String[] args) {
        System.out.println(CountYZ.countYZ("fez day"));
        System.out.println(CountYZ.countYZ("day fez"));
        System.out.println(CountYZ.countYZ("arta pasy caz paz may"));
        System.out.println(CountYZ.countYZ("dodo mio pare"));
    }*/

    /*main EqualIsNot
    public static void main(String[] args) {
        System.out.println(EqualIsNot.equalIsNot(null));
        System.out.println(EqualIsNot.equalIsNot(""));
        System.out.println(EqualIsNot.equalIsNot("is not"));
        System.out.println(EqualIsNot.equalIsNot("This is not"));
        System.out.println(EqualIsNot.equalIsNot("This is notnot"));
        System.out.println(EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
        System.out.println(EqualIsNot.equalIsNot("ahbisdfghaos"));
    }*/

    /*main SumDigits
    public static void main(String[] args) {
        System.out.println(SumDigits.sumDigits("aa1bc2d3"));
        System.out.println(SumDigits.sumDigits("aa11b33"));
        System.out.println(SumDigits.sumDigits("Chocolate"));
        System.out.println(SumDigits.sumDigits("156gaf546asdfg"));
    }*/

    public static void main(String[] args) {
        System.out.println(HammingDistance.hammingDistance("nicola", "n1cola"));
        System.out.println(HammingDistance.hammingDistance("nicola", "nicola"));
        System.out.println(HammingDistance.hammingDistance("nicola", "zzzzzz"));
        System.out.println(HammingDistance.hammingDistance("nicola", "n1col"));
        System.out.println(HammingDistance.hammingDistance("", "nicol"));
    }

}
