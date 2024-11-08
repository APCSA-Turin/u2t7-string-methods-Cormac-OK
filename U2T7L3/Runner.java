package U2T7L3;

public class Runner {
    public static void main(String[] args) {

        CustomStringMethods methods = new CustomStringMethods();


        // longerThan
        System.out.println(methods.longerThan("Good afternoon", 14));

        // funnyString
        System.out.println(methods.funnyString("ABCDEFG", 5));

        //halvesReversed
        System.out.println(methods.halvesReversed("Whale"));
        
        //pigLatin
        System.out.println(methods.pigLatin("Antidisestablishmentarianism"));


        //removeCharacter
        System.out.println(methods.removeCharacter("0123456789", 5));

        // insertAt
        System.out.println(methods.insertAt("Hello my name is Bob", "not ", "B"));

        //endUp
        System.out.println(methods.endUp("this is all lower case except for this.", 5));

        //yellOrWhisper
        System.out.println(methods.yellOrWhisper("hello THERE"));

        // starBetween
        System.out.println(methods.starBetween("STARS"));

    }
}
