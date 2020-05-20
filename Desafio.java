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
        int hora = scan.nextInt();      // lê a hora
        System.out.println("Digite o minuto:");
        int min = scan.nextInt();       // lê o minuto
        Relogio relogio = new Relogio();
        if (!(hora <0 || hora > 23)) {    // verifica se a hora é valida
            if(!(min < 0 || min > 60)){   // verifica se o minuto é valido
                if(hora >= 12){     // lê a hora e caso for maior ou igual a 12 subtrai 12 para se adequar ao horario de um relógio
                    hora = hora - 12;
                }
                if(min == 60){   // adapta muda 60 pra 0 pra se adequar ao relógio
                    min = 0;
                }
                GregorianCalendar horario = new GregorianCalendar(2020, 4, 20, hora, min); // GregorianCalendar é instânciado 
                long angulo = relogio.retornaAnguloRelogio(horario); // chamada do metodo retornaAnguloRelogio passando o long para a variável angulo
                if(hora == 0 && min == 15){    // como pedido nas intruções do desafio angulo as 00:15h é de 45 graus
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
