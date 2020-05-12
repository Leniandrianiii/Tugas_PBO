public class PencarianNilai implements InterfaceNilai{
    private int nilai1,nilai2,nilai3,nilai4,rata ;
    private String check ; 
 
    public PencarianNilai (int nilai1, int nilai2, int nilai3, int nilai4) {
        this.nilai1 = nilai1 ;
        this.nilai2 = nilai2 ; 
        this.nilai3 = nilai3 ;
        this.nilai4 = nilai4 ;
    }
    
     private int setRata() {
        rata = (nilai1 + nilai2 + nilai3 + nilai4)/4 ;
        return rata; 
    }
    
    @Override
    public int getRata() {
        return setRata() ;
    }
    
    @Override
    public String checkLulus() {
        if (getRata() > 85 && getRata() <101) {
            return check = "LULUS" ;
        }
        else {
            return check = "GAGAL" ;
        }
    }

    
}