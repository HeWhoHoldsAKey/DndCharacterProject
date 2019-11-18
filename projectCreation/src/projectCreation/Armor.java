package projectCreation;

public class Armor{
    public static void main(String[] args){
        myClass = "Rogue";
        myArmor = getArmor();
        System.out.println("AC:  " + myArmor);
    }
      
    public class getArmor(){
            switch(){
                  case "Rogue":
                    armor = "17";
                  break;
                  default:
                     armor = "15";
            }
            
            return armor;
    }
}
