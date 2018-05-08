package com.http.example

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory


class Main extends App {
  val config = ConfigFactory.load();
  val host = config.getString("http.host")
  val port = config.getInt("http.port")

  implicit val system = ActorSystem("actor system")
  implicit  val ec = system.dispatcher
  implicit val materializer = ActorMaterializer()

}
