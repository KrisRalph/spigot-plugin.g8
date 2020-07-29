import mill._
import scalalib._
import scalafmt._
import coursier.maven.MavenRepository

val spigot_jar = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/org/spigotmc/spigot-api/1.16.1-R0.1-SNAPSHOT/spigot-api-1.16.1-R0.1-20200727.105220-125.jar"

object $name;format="lower,word"$ extends ScalaModule with ScalafmtModule {
  def repositories = super.repositories ++ Seq(
    MavenRepository("https://oss.sonatype.org/content/repositories/snapshots"), //scalafix amongst others
    MavenRepository("http://repo.artima.com/releases"), // scalatest
    MavenRepository("https://hub.spigotmc.org/nexus/content/repositories/snapshots/"),
  )

  def scalaVersion = "2.13.3"

  def scalacOptions = Seq(
    "-Ydelambdafy:inline"
  )

  // `:` for java deps, `::` for scala deps.
  def ivyDeps = Agg(
    ivy"org.slf4j:slf4j-api:1.7.5",
  )

  def unmanagedClasspath = Agg(
    mill.modules.Util.download(
      spigot_jar,
      os.rel / "spigot-api-1.16.1-R0.1.jar"
    )
  )

  object test extends Tests {
    def ivyDeps = Agg(ivy"org.scalatest::scalatest:3.2.0")
    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }

  def mainClass = Some("$name;format="lower,word"$.Main")
} 
