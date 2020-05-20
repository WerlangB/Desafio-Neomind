import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author berna
 */
public class Relogio {
    
    public long retornaAnguloRelogio(GregorianCalendar horario){
        int hora = horario.get(Calendar.HOUR_OF_DAY);
        int min = horario.get(Calendar.MINUTE);
        int ponteiroHora = 0;
        int ponteiroMin = 0;
        long angulo = 0;
        for(int x = 0; x < hora; x++){
            ponteiroHora = ponteiroHora + 30; // 30 pra cada hora
        }
        for(int x = 0; x < min; x++){
            ponteiroMin = ponteiroMin + 6; // 6 pra cada minuto
        }
        if(ponteiroHora > ponteiroMin){
            angulo = ponteiroHora - ponteiroMin;
        }else if(ponteiroHora < ponteiroMin){
            angulo = ponteiroMin - ponteiroHora;
        }
        return angulo;
    }
    
}


