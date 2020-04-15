/* Copyright 2020 https://www.rishabhverma.in */
package com.rishabh.util;

import com.mongodb.Mongo;

import io.dropwizard.lifecycle.Managed;

public class MongoManaged implements Managed {

  private Mongo mongo;

  public MongoManaged(Mongo mongo) {
    this.mongo = mongo;
  }

  @Override
  public void start() throws Exception {}

  @Override
  public void stop() throws Exception {
    mongo.close();
  }

}
