import sbt._

class HelloAkkaProject(info: ProjectInfo) extends DefaultProject(info) with AkkaProject {
    val AkkaRepo = "Akka Repository" at "http://scalablesolutions.se/akka/repository"
}
