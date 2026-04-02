public class NotificationApp {
    // Violation: Tight coupling to a specific implementation

    private  MessageService notificationApp;

    // burada constructor injection ı gerekli
    private NotificationApp(MessageService notificationApp) {
        this.notificationApp = notificationApp;
    }

    public void notify(String message)
    {
        notificationApp.send(message);
    }



}