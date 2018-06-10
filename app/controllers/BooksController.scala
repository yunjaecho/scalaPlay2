package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import services.Counter

@Singleton
class BooksController @Inject() (cc: ControllerComponents,
                                 counter: Counter) extends AbstractController(cc) {

  def index = Action {
    Ok("ok")
  }

  def create = Action {
    Ok("")
  }

  def save = Action {
    Ok("")
  }

  def edit(id: Int) = Action {
    Ok(id.toString)
  }

  def update = Action {
    Ok("")
  }

  def destory(id: Int) = Action {
    Ok(id.toString)
  }

  // for book details
  def show(id: Int) = Action {
    Ok(id.toString)
  }

}
