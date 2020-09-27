package sda.basic.java.day3.Extras.Zadanie4;

public class Email {

    private final String reciver;
    private final String title;
    private final String bodyMsg;
    private final String attachment;

    public Email(Builder b) {
        this.reciver = b.reciver;
        this.title = b.title;
        this.bodyMsg = b.bodyMsg;
        this.attachment = b.attachment;
    }

    @Override
    public String toString() {
        return "Email{" +
                "reciver='" + reciver + '\'' +
                ", title='" + title + '\'' +
                ", bodyMsg='" + bodyMsg + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    public static class Builder {
        private String reciver;
        private String title;
        private String bodyMsg;
        private String attachment;

        public Builder reciver(String reciver) {
            this.reciver = reciver;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder bodyMsg(String bodyMsg) {
            this.bodyMsg = bodyMsg;
            return this;
        }

        public Builder attachment(String attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}
