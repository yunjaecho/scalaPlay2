package controllers

import javax.inject.{Inject, Singleton}

import scala.collection.mutable.Set
import model.Book
import play.data.FormFactory
import play.api.mvc.{AbstractController, ControllerComponents}
import services.Counter


@Singleton
class BooksController @Inject() (cc: ControllerComponents,
                                 counter: Counter) extends AbstractController(cc) {

  @Inject
  var formFactory: FormFactory = _

  def index = Action {
    val books: Set[Book] = Book.allBooks
    Ok(views.html.books.index.render(books))
  }

  def create = Action {
    val bookForm = formFactory.form(classOf[Book])
    Ok(views.html.books.create.render(bookForm))
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
