package com.freddieposer.semantics.supo1.parsing

import com.freddieposer.semantics.supo1.iterpreter.{AST, Program}
import com.freddieposer.semantics.supo1.parsing.antlr.{Supo1Lexer, Supo1Parser}
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}

class ParserCore(private var _text: String) {

  _text = _text + "\n"

  private var in = new ANTLRInputStream(text)

  def updateText(new_text: String) = {
    _text = new_text + "\n"
    in = new ANTLRInputStream(text)
  }
  def text = _text

  def parsed: Program = {
    val parser = new Supo1Parser(tokens)
    val visitor = new ProgramVisitor()
    parser.program().accept(visitor)
  }

  def tokens: CommonTokenStream = {
    val lexer = new Supo1Lexer(in)
    new CommonTokenStream(lexer)
  }



}
