grammar Supo1;

program: function*;

function: FUNCTION id id_list statement;

statement:
        expr SEMICOLON          #statement_expr
    |   assignment SEMICOLON    #statement_assignment
    |   if_statement            #statement_if
    |   codeblock               #statement_cb
    |   RETURN expr SEMICOLON   #statement_return
    ;

//TODO: Function call could be expr expr_list?
expr:
        L_PAREN expr R_PAREN            #expr_bracket
    |   id                              #expr_id_deref
    |   id expr_list                    #expr_function_call
    |   STAR expr                       #expr_ptr_deref
    |   expr EQ EQ expr                 #expr_equality
    |   expr PLUS expr                  #expr_addition
    |   INTEGER                         #expr_integer
    ;

expr_list: L_PAREN ((expr COMMA)* expr)? R_PAREN;

assignment: ptr_assign | local_assign;

ptr_assign: STAR expr EQ expr;
local_assign: id EQ expr;

if_statement: IF L_PAREN expr R_PAREN statement (ELSE statement)?;

codeblock: L_BRACK (statement SEMICOLON*)* R_BRACK;

id: IDENTIFIER;
id_list: L_PAREN ((id COMMA)* id)?  R_PAREN;


// LEXER
FUNCTION: 'function';
L_PAREN: '(';
R_PAREN: ')';

L_BRACK: '{';
R_BRACK: '}';

STAR: '*';
PLUS: '+';
EQ: '=';
IF: 'if';
ELSE: 'else';
RETURN: 'return';

SEMICOLON: ';';
COMMA: ',';

INTEGER: ('-')?[0-9][0-9]*;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

WS: [ \n\t\r] -> skip;
