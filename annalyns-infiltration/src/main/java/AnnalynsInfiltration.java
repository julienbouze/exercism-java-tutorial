class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == true){
            return false; 
        }
        else {
            return true ;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if ((knightIsAwake == false && archerIsAwake == true && prisonerIsAwake == true)|| (knightIsAwake == true && archerIsAwake == true && prisonerIsAwake == true) || (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false) || (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true) || (knightIsAwake == true && archerIsAwake == true && prisonerIsAwake == false) || (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true) || (knightIsAwake == false && archerIsAwake == true && prisonerIsAwake == false)){
            return true;
        }
            else if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false){
                return false;
            }
        else {
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }
        else {
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true || (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true) || (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true) || (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true) || (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false)){
            return true;
        }
        else {
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
