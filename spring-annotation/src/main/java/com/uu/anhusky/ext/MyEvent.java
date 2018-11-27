package com.uu.anhusky.ext;

import org.springframework.context.ApplicationEvent;

/**
 * √Ë ˆ£∫
 * User liupenghao
 * Date 2018/11/21 09:48
 **/
public class MyEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
