package com.example.oopjava;

public class KickBoxer extends Fighter {
    private int kickSpeed ;
    private int kickPower ;

    private int test = 1000;

    public KickBoxer(int numberOfGloves, int punchPower, int punchSpeed, int kickPower, int kickSpeed){
        super(numberOfGloves,punchSpeed,punchPower);
        if(numberOfGloves <=0 || punchPower<=0 || punchSpeed <=0 || kickPower <=0 || kickSpeed<=0){
            return;
        }else{
            setNumberOfGloves(numberOfGloves);
            setPunchSpeed(punchSpeed);
            setPunchPower(punchPower);
            this.kickSpeed = kickSpeed;
            this.kickPower = kickPower;
        }
    }


//    public void setNumberOfGlovesKick(int numberOfGloves){ // ga usa ditulis lagi kalau inheritance
//        setNumberOfGloves(numberOfGloves);
//    }

    public int getKickSpeed() {
        return kickSpeed;
    }

    public void setKickSpeed(int kickSpeed) {
        this.kickSpeed = kickSpeed;
    }

    public int getKickPower() {
        return kickPower;
    }

    public void setKickPower(int kickPower) {
        this.kickPower = kickPower;
    }

//    public int getPunchSpeed() {
//        return getPunchSpeed();
//    }
//
//    public void setPunchSpeedKB(int punchSpeed) {
//        setPunchSpeed(punchSpeed);
//    }

//    public int getPunchPower() {
//        return getPunchPower();
//    }
//
//    public void setPunchPowerKB(int punchPower) {
//        setPunchPower(punchPower);
//    }


    public String ThrowSideKick (){
        return "Side Kick";
    }

    public void testMethod(){
        kickPower = getNumberOfGloves()+test;
    }
}
