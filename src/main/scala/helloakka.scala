import akka.actor.Actor
import akka.actor.Actor.actorOf

class HelloWorldActor extends Actor {
    def receive = {
        case msg => {
            println(msg + ", World!")
        }
    }
}

