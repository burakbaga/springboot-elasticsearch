package com.course.practicaljava.common;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;



@SuppressWarnings("deprecation")
@Configuration
public class ElasticsearchConfig extends AbstractElasticsearchConfiguration {

	@Override
	public RestHighLevelClient elasticsearchClient() {
		final var clientConfiguration = ClientConfiguration.builder().connectedTo("localhost:9200").build();
		// TODO Auto-generated method stub
		return RestClients.create(clientConfiguration).rest();
	}
	

}
