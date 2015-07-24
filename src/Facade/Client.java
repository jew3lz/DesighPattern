package Facade;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class Client {
    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();

        letterProcess.writeContext("Hi,How are you......");

        letterProcess.fillEnvelope("1st Street,666,Heven");

        letterProcess.letterIntoEnvelop();

        letterProcess.sendLetter();
    }
}
