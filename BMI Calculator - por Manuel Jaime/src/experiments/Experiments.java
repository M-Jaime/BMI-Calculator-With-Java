package experiments;

import java.time.LocalDateTime;

public class Experiments {
    public static void main(String[] args) {
        
      
        LocalDateTime ldt = LocalDateTime.now(); // meu objecto para pegar os métodos de tempo
        
        int dia = ldt.getDayOfMonth();
        String mes = ldt.getMonth().toString();
        int ano = ldt.getYear();
        
        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
        
        
        System.out.println(ldt.getHour()+":"+ldt.getMinute());
        
        
    }
    
}
