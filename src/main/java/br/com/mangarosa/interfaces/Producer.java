package br.com.mangarosa.interfaces;

import java.io.Serializable;

public interface Producer extends Serializable {
    void addTopic(Topic topic);
    void removeTopic(Topic topic);
    void sendMessage(String message);
    String name();
}
