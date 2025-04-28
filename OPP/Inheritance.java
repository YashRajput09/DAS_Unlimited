
public class Inheritance {
    public static void main(String[] args){
        Charger ch = new Charger();
       System.out.println(ch.company("Samsung s24 ultra"));
       System.out.println(ch.chargerPower(200));
    }
}

// base class 
class Mobile{
    String name;
    String company(String brandName){
    return this.name = brandName;
    }
}

class Charger extends Mobile{
    int camera;
    int chargerPower(int camera){
       return this.camera = camera;
    }
}
