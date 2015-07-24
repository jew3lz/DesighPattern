package Facade;

/**
 * Created by JEWELZ on 24/7/15.
 * 定义一个写信的过程
 */
public interface LetterProcess {
    //首先是写信的内容
    void writeContext(String context);

    //写信封
    void fillEnvelope(String address);

    //把信放到信箱里
    void letterIntoEnvelop();

    //邮寄
    void sendLetter();
}
