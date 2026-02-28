class HellsingCharacter {
    String name;
    String role;
    String ability; // Renamed from "skill" for better fit

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Ability: " + ability);
    }
}

public class Main {
    public static void main(String[] args) {

        HellsingCharacter character1 = null;

        try {
            character1.displayInfo();
        } catch (NullPointerException e) {
            System.out.println("Hellsing character object is not created.");
        }

        character1 = new HellsingCharacter();

        // Using Alucard - the iconic protagonist of Hellsing
        character1.name = "Alucard";
        character1.role = "Hellsing Organization's Ultimate Weapon";
        character1.ability = "Vampiric Powers (Shapeshifting, Regeneration, Reality Warping)";

        character1.displayInfo();
    }
}
