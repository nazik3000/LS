package animal;

import lombok.Data;


public enum PetsAction {
    
    CATS("Meow"),
    DOGS("Woof"),
    BIRDS("Sing song"),
    RODENTS("Fr-Fr-Fr");
    
   
   private String voice;
   PetsAction(String voice){
    this.voice=voice;
   }
   public String getVoice(){return voice;}

}
