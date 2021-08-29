package ru.ivmiit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndependentMessageRenderer {
    @Autowired
    private MessageRenderer renderer;

    //public IndependentMessageRenderer(MessageRenderer renderer) {
    //    this.renderer = renderer;
    //}

    public void print(){
        renderer.printMessage();

    }
}
