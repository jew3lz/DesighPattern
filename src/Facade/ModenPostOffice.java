package Facade;

/**
 * Created by JEWELZ on 24/7/15.
 */
public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    //封装的过程
    public void sendLetter(String context, String address) {
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);
        //把信放到信封中
        letterProcess.letterIntoEnvelop();
        //邮递信件
        letterProcess.sendLetter();
    }
}
