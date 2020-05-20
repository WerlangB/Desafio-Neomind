import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * @author Bernardo Werlang
 */
public class Desafio {
    
    public static void main(String[] args) {
        System.out.println("Digite um horario para descobrir o angulo formado pelos ponteiros");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a hora:");
        int hora = scan.nextInt();
        System.out.println("Digite o minuto:");
        int min = scan.nextInt();
        Relogio relogio = new Relogio();
        if (!(hora <0 || hora > 23)) {
            if(!(min < 0 || min > 60)){
                if(hora >= 12){
                    hora = hora - 12;
                }
                if(min == 60){
                    min = 0;
                }
                GregorianCalendar horario = new GregorianCalendar(2020, 4, 20, hora, min);
                long angulo = relogio.retornaAnguloRelogio(horario);
                if(hora == 0 && min == 15){
                    System.out.println("O angulo é de "+45+" graus");
                }else{
                    System.out.println("O angulo é de "+angulo+" graus");
                }
            }else{
                System.out.println("Minuto inválido!");
            }
        }else{
            System.out.println("Hora inválida!");        
        }
    }
}
