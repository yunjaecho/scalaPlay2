package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def about = Action {
    Ok("About")
  }

  def welcome(name: String, lastName: String) = Action {
    //Ok(s"name is ${name} and lastName : $lastName")
    Ok(views.html.Home.welcome.render(name, lastName))
  }

}
