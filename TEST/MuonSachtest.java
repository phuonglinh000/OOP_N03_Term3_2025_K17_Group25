package TEST;
import MuonSach;

//import src.MuonSach;
import java.time.LocalDate;

public class MuonSachtest {
    
    public static void test(){
        
        MuonSach muon = new MuonSach("L1", "l123");
        

        System.out.println(muon);

        LocalDate newDeadline = muon.getNgayHetHan().plusDays(7);
        muon.setNgayHetHan(newDeadline);

        System.out.println("== SAU KHI GIA HAN ==");
        System.out.println(muon);
  
}
}
