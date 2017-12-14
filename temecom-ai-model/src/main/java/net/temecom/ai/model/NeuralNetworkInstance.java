package net.temecom.ai.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NeuralNetworkInstance extends AIEntity{
	protected Date startTime;
}
