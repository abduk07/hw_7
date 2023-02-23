public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] superAbilities = {new Warrior(), new Magic(), new Medic()};
        for (int i = 0; i < superAbilities.length; i++) {
            superAbilities[i].applySuperAbility();
            if (superAbilities[i] instanceof Medic) {
                System.out.println((((Medic) superAbilities[i]).getHealPoints()));
                ((Medic) superAbilities[i]).increaseExperience();
                System.out.println((((Medic) superAbilities[i]).getHealPoints()));
            }

        }
    }


}