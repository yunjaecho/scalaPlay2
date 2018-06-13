package model

import scala.collection.mutable.Set

case class Book(id: Int, title: String, price: Int, author: String) {
  def this() = {
    this(id=0, title="", price=0, author="")
  }
}


object Book {
  val books: Set[Book] = Set(
    new Book(1, "C++", 20, "ABC"),
    new Book(2, "Java", 30, "XYZ")
  )

  def allBooks: Set[Book] = {
    books
  }

  def findById(id: Int) = {
    books.find(_.id == id)
  }

  def add(book: Book): Unit = {
    books += book
  }

  def remove(book: Book) = {
    books.remove(book)
  }
}
