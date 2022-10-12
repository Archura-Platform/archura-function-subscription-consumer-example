package io.archura.platform.functionalcore.subscription;

import io.archura.platform.api.context.Context;
import io.archura.platform.api.logger.Logger;
import io.archura.platform.api.type.Configurable;
import io.archura.platform.api.type.functionalcore.SubscriptionConsumer;

import java.util.Map;

public class MessageSubscriptionConsumer implements SubscriptionConsumer, Configurable {

    private Map<String, Object> configuration;

    @Override
    public void setConfiguration(Map<String, Object> configuration) {
        this.configuration = configuration;
    }

    @Override
    public void consume(Context context, String channel, String message) {
        final Logger logger = context.getLogger();
        logger.info("configuration: %s", configuration);

        logger.info("channel: %s, message: %s", channel, message);
    }

}
