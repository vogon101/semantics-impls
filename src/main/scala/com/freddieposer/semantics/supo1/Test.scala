package com.freddieposer.semantics.supo1

import com.freddieposer.semantics.supo1.iterpreter.{FunctionCall, FunctionDetails, LanguageValue, LocalsState, Program, ProgramState}
import com.freddieposer.semantics.supo1.parsing.ParserCore

import scala.collection.immutable.HashMap
import scala.collection.mutable

object Test extends App {

  val prog:Program = new ParserCore(
    """
      |function f(beg, end) {
      |if (beg == end) {
      |return 0;
      |} else {
      |return *beg + f(beg + 1, end);
      |}
      |}
      |function a() {
      |x = allocate(3);
      |*(x + 0) = 1;
      |*(x + 1) = 2;
      |*(x + 2) = 3;
      |return f(x, x + 3);
      |}
      |function b() {
      |x = allocate(1);
      |*x = 5;
      |return f(x, x + 1);
      |}
      |function other() {
      |x = allocate(3);
      |*(x + 0) = 1;
      |*(x + 1) = 2;
      |*(x + 2) = 3;
      |return *(x + 0) + *(x+1);
      |}
      |
      |function test() {
      |return 2;
      |return 3;
      |}
      |
      |""".stripMargin).parsed

  val mapping = prog.function_defs.map(fd => (fd.name -> FunctionDetails(fd.name, fd.args, fd.body)))

  val map = new HashMap[String, FunctionDetails] ++ mapping

  val state = ProgramState(null, 0, new HashMap[Int, LanguageValue](), map)

  println(prog.function_defs)

  println(FunctionCall("test", List()).reduceWith(state))

}
