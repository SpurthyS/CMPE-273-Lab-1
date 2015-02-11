package hello

import hello.HelloConfig
import org.springframework.boot.SpringApplication
/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author spurthy
 * @since 1.0
 */
object HelloWebApplication {

  def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloConfig]);
  }
}