public class GmailService implements  MessageService{
    @Override
    public void send(String msg) {
        System.out.println("Gmail: " + msg);
    }
}
