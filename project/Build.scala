import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "blankPlayApp"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

val a = uri("git://github.com/randyunger/akka-couch.git")

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    ) dependsOn a

}
