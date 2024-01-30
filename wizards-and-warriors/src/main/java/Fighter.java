abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);
    
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
}

class Warrior extends Fighter {
    

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()){
            return 10;
        }
        else {return 6;}
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false ; 
    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (isVulnerable()){
            return 3 ;
        }
        else{return 12;}
    }

    void prepareSpell() {
        spellPrepared = true;
    }

}
