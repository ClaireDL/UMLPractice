

class Author(var n: String, var e: String, var g: Char) {

  // private instance variable
  private var _name: String = n
  private var _email: String = e
  private var _gender: Char = g

  def name: String = this._name
  def name_=(value: String): Unit = this._name = value

  def email: String = this._email
  def email_=(value: String): Unit = this._email = value

  def gender: Char = this._gender

  override def toString(): String = {
    s"Author[name = $name, email = $email, gender = $gender]"
  }
}

class Book(var n: String, var a: Author, var p: Double, var q: Int){

    def this(n: String, a: Author, p: Double) = this(n, a, p, 0)

    private var _name: String = n
    private var _author: Author = a
    private var _price: Double = p
    private var _quantity: Int = q

    def name: String = this._name

    def author: Author = this._author

    def price: Double = this._price
    def price_=(value: Double): Unit = this._price = value

    def quantity: Int = this._quantity
    def quantity_=(value: Int): Unit = this._quantity = value

    override def toString(): String = {
      "Book[name= " + name + "," + author.toString() + ", price= " + price + ", quantity= " + quantity
    }

    // does not work: author.name is not visible outside Author
    // def authorName: String = this._author.name
    }
