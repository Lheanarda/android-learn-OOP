package com.example.oopjava;

public class Boxer extends Fighter { //inheritance

//    public static int stamina = 80; //shared variable
   private static int stamina = 80; //static = shared (semua kelas yang pakai hasilnya sama)

    public int getNumberOfGloves(){
        return getNumberOfGloves();
    }

    public  void  setNumberOfGloves(int numberOfGloves){
        if(numberOfGloves==0){
          return; //return result without allowing below code
      }
////        this.numberOfGloves = numberOfGloves; //this refer to instance variable

        setNumberOfGloves(numberOfGloves);
    }

    public Boxer(int numberOfGloves,int punchSpeed, int punchPower){
        super(numberOfGloves,punchSpeed,punchPower);
        if(numberOfGloves<=0 || punchSpeed<=0 || punchPower<=0){
            return;
        }else{
            setNumberOfGloves(numberOfGloves);
            setPunchPower(punchPower);
            setPunchSpeed(punchSpeed);
        }

    }

    public static int getStamina() {
        return stamina;
    }

    public static void setStamina(int stamina) {
        Boxer.stamina = stamina;
    }

    public String throwJab(){ //method
        return "Jab";
    }

    @Override //kalau mau ubah method di inheritance
    public void setPunchSpeed(int punchSpeed){
        super.setPunchSpeed(punchSpeed);
    }
}
