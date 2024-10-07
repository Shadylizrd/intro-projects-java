public class MadLibs {
    /*
    This program creates a mad-libbed story
    Author: Rhiannon
    Date: 07/10/2024
     */
    public static void main(String[] args) { 
        //The template for the story
        String name1 = "The Lorax";
        String adjective1 = "Sad";
        String adjective2 = "Funky";
        String adjective3 = "Exasperated";
        String verb1 = "bounce";
        String noun1 = "cat";
        String noun2 = "foot";
        String noun3 = "Za Warudo!";
        String noun4 = "Dio Brando";
        String noun5 = "Star Platinum";
        String noun6 = "Joeseph Joestar";
        String name2 = "Jotaro Kujo";
        int number = 1000000000;
        String place1 = "Morioh Cho";

        String story = "This morning "+name1+" woke up feeling "+adjective1+
        ". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+
        " in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+
        ". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+
        ". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
/* 
I would like to make a version of this with some user interface so that
players can write in their own variables without needing to access the code
*/