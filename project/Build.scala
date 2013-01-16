import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName = "code-story"
  val appVersion = "1.0"

  val appDependencies = Seq(
    // Add your project dependencies here,
  )

  publishTo := Some("release" at "http://repository-grainedekawa.forge.cloudbees.com/release/")

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(

  )

}
