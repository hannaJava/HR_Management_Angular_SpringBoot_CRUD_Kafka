package com.genspark.KafkaConsumer.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerImpl implements KafkaConsumerInt{
	@KafkaListener(topics = "HrEventTopic", groupId = "Group1")
	public void listen(String hrEvent)
	{
		System.out.println("Received '" + hrEvent +"' from the HrEventTopic." );
	}
}
