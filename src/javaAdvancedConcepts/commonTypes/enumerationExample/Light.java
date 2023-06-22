package javaAdvancedConcepts.commonTypes.enumerationExample;

public class Light {
    public Light(){
    }
    public void changeLight(StopLight currentLight){
        if(currentLight == StopLight.GREEN){
            System.out.println("GREEN  MEANS GO!");
        } else if(currentLight == StopLight.YELLOW){
            System.out.println("SLOW DOWN!");
        } else if(currentLight == StopLight.RED){
            System.out.println("STOP!");
        }
    }
}
