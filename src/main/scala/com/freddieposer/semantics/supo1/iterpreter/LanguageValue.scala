package com.freddieposer.semantics.supo1.iterpreter

sealed abstract class LanguageValue {

  def + (that: LanguageValue): LanguageValue

}

case class IntegerValue(v : Int) extends LanguageValue {
  override def +(that: LanguageValue): LanguageValue = that match {
    case (t: IntegerValue) => IntegerValue(v + t.v)
    case (t: PointerValue) => PointerValue(v + t.v)
  }


}
case class PointerValue(v : Int) extends LanguageValue {
  override def +(that: LanguageValue): LanguageValue = that match {
    case (t: IntegerValue) => PointerValue(v + t.v)
    case (t: PointerValue) => PointerValue(v + t.v)
  }
}

case object NULLValue extends LanguageValue {
  override def +(that: LanguageValue): LanguageValue = ???
}