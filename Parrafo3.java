public class NotificationSystem {
    public interface Notification {
        void sendNotification();
    }

    public static class BasicNotification implements Notification {
        @Override
        public void sendNotification() {
            System.out.println("Enviando notificación básica (SMS + Email).");
        }
    }

    public static abstract class NotificationDecorator implements Notification {
        protected final Notification decoratedNotification;

        public NotificationDecorator(Notification decoratedNotification) {
            if(decoratedNotification == null) {
                throw new IllegalArgumentException("Notificación no puede ser nula");
            }
            this.decoratedNotification = decoratedNotification;
        }

        @Override
        public void sendNotification() {
            decoratedNotification.sendNotification();
        }
    }

    public static class WhatsappDecorator extends NotificationDecorator {
        public WhatsappDecorator(Notification decoratedNotification) {
            super(decoratedNotification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por WhatsApp.");
        }
    }

    public static class SignalDecorator extends NotificationDecorator {
        public SignalDecorator(Notification decoratedNotification) {
            super(decoratedNotification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por Signal.");
        }
    }

    public static class WireDecorator extends NotificationDecorator {
        public WireDecorator(Notification decoratedNotification) {
            super(decoratedNotification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por Wire.");
        }
    }

    public static class TelegramDecorator extends NotificationDecorator {
        public TelegramDecorator(Notification decoratedNotification) {
            super(decoratedNotification);
        }

        @Override
        public void sendNotification() {
            super.sendNotification();
            System.out.println("Enviando notificación por Telegram.");
        }
    }
}