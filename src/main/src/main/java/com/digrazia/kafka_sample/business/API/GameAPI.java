package com.digrazia.kafka_sample.business.API;

import java.util.concurrent.ExecutionException;

public interface GameAPI {

    void sendGame() throws ExecutionException, InterruptedException;
}
