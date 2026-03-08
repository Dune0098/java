package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] incrementByOne(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = v[i] + 1;
        }
        return v;
    }
    static void main() {
    int[] g = {1,2,3,4,5};

    /*
    in Java un array è un oggetto, puoi accedere alla sua lunghezza.
    Puoi fare array di tutti i tipi stringhe, double, int ecc
    */
    int[] v = new int[10];
    int[] k = {1,2,3,4,5,6,7};
    v = incrementByOne(v);
    /*
    Se abbiamo un array di tipo primitivo abbiamo i valori dei tipi primitivi, se invece
    dichiariamo un array di oggetti stimao in realtà dichiarando un array di riferimenti, quindi di
    puntatori che occupano di soli 64 byte ma dipende dall'architettura.
    Ad esempio un array di persone è un array di puntatori e ognuno di questi punta a un oggetto persona
    */
    /*
    Per creare un array bidimensioenale di 2 righe e 3 colonne, puoi scambiare righe e colonne
    semplicemente invertendo i puntatori
    */
    String[][] table = new String[2][3];
    // Per iterare sugli array puoi usare for each

        /*
        Esistono diversi metodi utili per gli array come fill, il binary search e il sort
        Tutti questi metodi sono nella clase Arrays
        */
        int[] a = {1,4,6,8,9,};
        System.out.println(Arrays.toString(a)); // stampa un array ad esempio
        /*Come dichiarare le stringhe:
        primo modo usare i doppi apici,
        secondo modo esplicitare che la stringa è un oggetto new String(origin "string");
        terza modalità utilizzare apici
        Tutte le funzioni correlate alle stringhe sono nella calsse String*/

        /*
        Come le stringhe vengono salvate in memoria?
        L'operatore == usato sui riferimenti dice se gli oggetti puntati dai riferimenti rappresentano la stessa cosa
        Le stringhe inizializzate con String a = "abc" sono salvate tutte insieme quindi se ne crei due uguali e usi == ritorna true. Se invece usi
        new String(origin "abc") e ne crei due uguali e provi a usare == ritorna false.
        Le stringhe in java sono immutabili
        in java hai anche l'operatore += per aggiungere caratteri però se lo iteri crei una nuova stringa per ogni nuova aggiunta che fai.
        una cosa tipo:
        String a = "abc";
        for(int i = 0; i < 100; i++){
            a += "abc"
        }
        questo crea 100 stringhe in memoria oltre alla originale, per fare questa cosa di solito si usa lo string builder. Non si concatenano le stringhe con + ma si
        concateano con string buileder.
        Integer versione tipo oggetto di un tipo int, vala le stessa osservazione delle stringhe su questo oggetto
        */

        /*
        Tutti gli oggetti hanno in comune il metodo equals che confranta se sono uguali (il contenuto non se sono fisicamente lo stesso oggetto)
        Un metodo definto dentro object è un metodo definito dentro tutto perchè è object è un oggetto originario da cui tutti gli oggetti ereditano.
        In java standard input, output e error sono indicati come metodi di system definiti come in, out, err
        esempio per leggere
        */
        Scanner input = new Scanner(System.in);
        double  n = input.nextDouble(); // voglio che l'utente iserisca un double, il metodo fallisce finchè questo non succede

        /*
        In python non esistono tipi primitivi ha solo oggetti, java ha sia tipi primitivi e anche oggetti che
        rappresentano un tipo primitivo chiamati wrapper. Wrapper e tipi primitivi sono
        Boxing --> prendo tipo primitivo e lo metto in un oggetto
        Unboxing --> prendo oggetto e lo trasformo in tipo primitivo
        Questi wrapper si usano per convertire da stringa e tipi primiti oppure tipo primitivo o oggetto
        Tutti le conversioni da e verso le stringhe usano il tipo wrapper corrispondente
         */
    }
}
