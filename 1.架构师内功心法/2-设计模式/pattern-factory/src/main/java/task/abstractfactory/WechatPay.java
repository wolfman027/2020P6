package task.abstractfactory;

public class WechatPay implements IPay {
    public void pay() {
        System.out.println("微信支付");
    }
}
