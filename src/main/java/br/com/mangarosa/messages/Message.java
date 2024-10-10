package br.com.mangarosa.messages;

import br.com.mangarosa.interfaces.Consumer;
import br.com.mangarosa.interfaces.Producer;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable {
    private String id;
    private Producer producer;
    private final LocalDateTime createdAt;
    private final List<MessageConsumption> consumptionList;
    private boolean isConsumed;
    private String message;

    public Message(Producer producer, String message) {
        setProducer(producer);
        setMessage(message);
        this.createdAt = LocalDateTime.now();
        this.consumptionList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Producer getProducer() {
        return producer;
    }

    private void setProducer(Producer producer) {
        this.producer = producer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public boolean isConsumed() {
        return isConsumed;
    }

    public void setConsumed(boolean consumed) {
        isConsumed = consumed;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public void addConsumption(Consumer consumer) {
        this.consumptionList.add(new MessageConsumption(consumer));
    }
}
