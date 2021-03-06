package com.org.spring.boot.amqp.processor.bridge;

import com.org.spring.boot.amqp.message.PointsMessageData;
import com.org.spring.boot.amqp.processor.Event;
import com.org.spring.boot.amqp.processor.Processor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PointsStatusProcessor extends Processor<PointsMessageData> {

    public PointsStatusProcessor() {
        super(PointsMessageData.class);
    }

    @Override
    public void process(final String message) {
        super.process(message);
    }

    @Override
    protected Event buildEvent(final PointsMessageData pointsMessageData) {
        return new Event("device.panel.points.status", pointsMessageData.getSerial());
    }

}
