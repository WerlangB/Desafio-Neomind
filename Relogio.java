import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Bernardo Werlang
 */
public class Relogio {
    
    public long retornaAnguloRelogio(GregorianCalendar horario){
        int hora = horario.get(Calendar.HOUR_OF_DAY);   // separa a hora do resto das informações do GregorianCalendar
        int min = horario.get(Calendar.MINUTE);         // separa o minuto do resto das informações do GregorianCalendar
        int ponteiroHora = 0;   // inicialização da variável do ponteiro que representa a hora
        int ponteiroMin = 0;    // inicialização da variável do ponteiro que representa o minuto
        long angulo = 0;        // inicialização da variável do angulo
        for(int x = 0; x < hora; x++){
            ponteiroHora = ponteiroHora + 30; // soma 30 pra cada hora
        }
        for(int x = 0; x < min; x++){
            ponteiroMin = ponteiroMin + 6; // soma 6 pra cada minuto
        }
        if(ponteiroHora > ponteiroMin){         // subrai o menor do maior para pegar a diferença entre os ponteiros
            angulo = ponteiroHora - ponteiroMin;
        }else if(ponteiroHora < ponteiroMin){
            angulo = ponteiroMin - ponteiroHora;
        }
        return angulo;
    }
    
}


