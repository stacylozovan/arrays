package nl.saxion.iad.cipher;

import nl.saxion.app.SaxionApp;

public class CipherMain implements Runnable{
    char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public void run(){
        char[] word1 = "vriwzduh".toCharArray();
        char[] word2 = "dojrulwkp".toCharArray();
        char[] word3 = "dqdfkurqlvp".toCharArray();


        SaxionApp.print("word1: ");
        SaxionApp.printLine(decipher(word1));
        SaxionApp.print("word2: ");
        SaxionApp.printLine(decipher(word2));
        SaxionApp.print("word3: ");
        SaxionApp.printLine(decipher(word3));
    }





    public char[] decipher(char[] input){
        //TODO: decipher the input


        return input;
    }


    private char deciperChar(char input){
        //TODO: implement


        return input;
    }


    public static void main(String[] args) {
        SaxionApp.start(new CipherMain(), 1024, 768);
    }
}
