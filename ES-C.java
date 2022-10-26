import java.io.*;
class java
{
    public static void main(String args[]) throws IOException
    {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    
    int numeroVocali = 0;
    int numeroConsonanti = 0;
    int numeroLettere;
    int contantore1 = 0;
    int contantore2 = 0;
    {

    System.out.println("Scrivi una frase:");
    String parola=tastiera.readLine(); 
    
    numeroLettere = parola.length();
    for (int contatore1 = 0; contatore1 < numeroLettere; contatore1++) {
    if ((parola.charAt(contatore1) == 'a') || (parola.charAt(contatore1) == 'e') ||
    (parola.charAt(contatore1) == 'i') || (parola.charAt(contatore1) == 'o') ||
    (parola.charAt(contatore1) == 'u') || (parola.charAt(contatore1) == 'A') ||
    (parola.charAt(contatore1) == 'E') || (parola.charAt(contatore1) == 'I') ||
    (parola.charAt(contatore1) == 'O') || (parola.charAt(contatore1) == 'U')) {
    numeroVocali++;}
    }
    for (int contatore2 = 0; contatore2 < numeroLettere; contatore2++) {
        if ((parola.charAt(contatore2) == 'b') || (parola.charAt(contatore2) == 'B') ||
        (parola.charAt(contatore2) == 'c') || (parola.charAt(contatore2) == 'C') ||
        (parola.charAt(contatore2) == 'd') || (parola.charAt(contatore2) == 'D') ||
        (parola.charAt(contatore2) == 'f') || (parola.charAt(contatore2) == 'F') ||
        (parola.charAt(contatore2) == 'g') || (parola.charAt(contatore2) == 'G') ||
        (parola.charAt(contatore2) == 'h') || (parola.charAt(contatore2) == 'H') ||
        (parola.charAt(contatore2) == 'j') || (parola.charAt(contatore2) == 'J') ||
        (parola.charAt(contatore2) == 'k') || (parola.charAt(contatore2) == 'K') ||
        (parola.charAt(contatore2) == 'l') || (parola.charAt(contatore2) == 'L') ||
        (parola.charAt(contatore2) == 'm') || (parola.charAt(contatore2) == 'M') ||
        (parola.charAt(contatore2) == 'n') || (parola.charAt(contatore2) == 'N') ||
        (parola.charAt(contatore2) == 'p') || (parola.charAt(contatore2) == 'P') ||
        (parola.charAt(contatore2) == 'q') || (parola.charAt(contatore2) == 'Q') ||
        (parola.charAt(contatore2) == 'r') || (parola.charAt(contatore2) == 'R') ||
        (parola.charAt(contatore2) == 's') || (parola.charAt(contatore2) == 'S') ||
        (parola.charAt(contatore2) == 't') || (parola.charAt(contatore2) == 'T') ||
        (parola.charAt(contatore2) == 'v') || (parola.charAt(contatore2) == 'V') ||
        (parola.charAt(contatore2) == 'w') || (parola.charAt(contatore2) == 'W') ||
        (parola.charAt(contatore2) == 'x') || (parola.charAt(contatore2) == 'X') ||
        (parola.charAt(contatore2) == 'y') || (parola.charAt(contatore2) == 'Y') ||
        (parola.charAt(contatore2) == 'z') || (parola.charAt(contatore2) == 'Z')) {
        numeroConsonanti++;}
        }
    System.out.println("Nella parola ci sono presenti "+numeroVocali+" vocali e "+numeroConsonanti+" consonanti");}    
    }
    
}
