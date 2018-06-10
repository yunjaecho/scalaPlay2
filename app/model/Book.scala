package model

import scala.collection.mutable.Set

case class Book(id: Int, title: String, price: Int, author: String) {
  val books: Set[Book] = Set(
    Book(1, "C++", 20, "ABC"),
    Book(2, "Java", 30, "XYZ")
  )

  def allBooks: Set[Book] = {
    books
  }

  def findById(id: Int): Option[Book] = {
    books.find(_.id == id)
  }

  def add(book: Book): Unit = {
    books += book
  }

  def remove(book: Book) = {
    books.remove(book)
  }

}