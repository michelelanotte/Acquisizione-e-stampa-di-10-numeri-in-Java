/*
 *
 Acquisizione e stampa di 10 numeri
 *
*/
import java.io.*;
public class principale
{
    public static void main(String args[]) {
    
        int i;
        int p[] = new int[10];
    
        //Gestione input
        InputStreamReader in = new InputStreamReader(System.in); //Dichiarazione dell' oggetto di input che servirà per creare una sorta di canale con lo standard degli input
        BufferedReader tastiera = new BufferedReader(in); //Dichiarazione del lettore dell'oggetto in 
   
        //Acquisizione
        for(i = 0; i < 10; i++) {    
            try{
                System.out.println("Inserisci un intero: ");
                p[i] = Integer.parseInt(tastiera.readLine()); //Assegna a p il valore dell'intero acquisito da tastiera
            }catch(IOException e) {
                System.out.println("Errore nell'acquisizione!");
            }
        }
    
        //Stampa su console
        System.out.println("interi inseriti: ");
        for(i = 0; i < 10; i++) {
            System.out.println(p[i]);        
        }
    }
}