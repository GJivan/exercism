abstract class Fighter {

    boolean isVulnerable() {
        throw new UnsupportedOperationException("Please provide implementation for this method");
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {


    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean spellPrepared = false;

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return spellPrepared ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        spellPrepared = true;
    }

}
