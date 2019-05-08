grammar Enki;
 
 program : typedef* 
//        funcdefs*
//        statement*
 ;
 
 typedef : 'typedef' TypeId '=' baseType '(' typearguments?  ')';
 
 typearguments : '{'  typeargument (',' typeargument)* '}';
 typeargument  : Id ':' type;
 baseType : TYPE_BASE |TypeId;
 type : type_function| TYPE_NUMBER | TYPE_STRING | TYPE_BOOL|TYPE_BYTEBUF|  TypeId;
 type_function :TYPE_FUNCTION '<' f_types_in '->' f_types_out  '>' ;
 
 f_types_out : type|( '(' type (',' type)*  ')');
 f_types_in  : type|( '(' type (',' type)*  ')');

         
 TYPE_BASE    : 'Base'   ;
 TYPE_BOOL    : 'Bool'   ;
 TYPE_STRING  : 'Str'    ;
 TYPE_NUMBER  : 'Num'    ;
 TYPE_BYTEBUF : 'ByteBuf';
 TYPE_FUNCTION: 'func' ;
 
 
 my_rule :Id | type_function;


 TypeId : [A-Za-z][a-zA-Z0-9]+;         
 Id : [a-z][a-zA-Z0-9]*; 
 
//block : '{' statement* '}';
// 
//stm_assigment : 'var' Id '=' object EOL;
// 
// /*
//  
//	 [
//	   (condition): function  
//     ]
//  
//    */
//
// 
//
// 
// expression:;
//boolean_expresson:object|boolean_expresson  logical_binary_op boolean_expresson ;
// 
// 
//statement : stm_assigment  ;
// 
//logical_binary_op : And | Or| Xor|Nand|Nor|Xnor|Imply;
//logical_unary_op : Not;
//
//mathematical_binary_op : Add|Sub|Multiply|Div| Mod|IntDiv|Pow;
//mathematical_unary_op  : UnaryMinus;
//
//object : Null|Id | number |bool| string | map | list | function| function_call|expression;
//function : '(' argslist? ')' '=>' functionbody;
//functionbody : statement | block;
//function_call : object  '[' (object (',' object )*)? ']' ;
// 
//argslist : Id (',' Id)*; 
//list : '[' object (',' object )* ']' | '[' ']';
//map : '{' keyvaluepair (',' keyvaluepair )* '}' | '{' '}';
//keyvaluepair : key ':' object;
//key : Id | QuotedId;
//bool : 'True' | 'False';
//string :  STRING_VALUE ;
//number : mathematical_unary_op? (integer|real | complex);
//real :  DIGIT+ ('.' DIGIT+)?;
//integer : DIGIT+;
//complex : (real (Add|Sub))? real 'i';
// 
//switch_function : '['  case_function ']';
//case_function : boolean_expresson ':' object;
//
////string : '[' Characters ']' ;// | EMPTYSTRING;
//QuotedId : '\'' [a-z][a-zA-Z0-9]* '\''; 
//Null : 'null';
 
//And : '&';
//Or : '|';
//Xor : '^';
//Nand : '~&';
//Nor : '~|';
//Xnor : '~^';
//Imply : '->';
//Not :'~';
//
//
//STRING_VALUE
//   :   '\'' ('\'\'' | ~ ('\''))*   '\''
//   ;
//DIGIT : [0-9];
////Characters :([a-zA-Z0-9]|[\t\r\n]|EQ|NONALPHA|SINGLE_QUOTE)+;
////EMPTYSTRING :DOUBLE_QUOTE DOUBLE_QUOTE;
//LEFTBRACKET : '(';
//CLOSEBRACKET : ')';
//LEFT_SQ_BRACKET : '[';
//RIGHT_SQ_BRACKET : ']';
//
//UnaryMinus : '-';
//Sub : '-';
//DOT : '.';
//Add  : '+';
//Multiply  : '*';
//Div  : '/';
//IntDiv  : '//';
//Mod  : '%';	
//Pow  : '**';
//
//EOL : ';'
//NONALPHA : '+'|'-'|'/'|'*'|'!'|'$'|'%'|'^'|'&'|'('|')'|'{'|'}'|';'|':'|'.'|'|'|'\\'|''|'<'|'>'|'?'|'#'|'~'|'@';
//EQ : '=';
//OPENTAG  : '[:';
//CLOSETAG : ':]';
//DOUBLE_QUOTE :'"';
//SINGLE_QUOTE :'\'';
//ESC :  '`';

//r  : 'hello' ID ;         // match keyword hello followed by an identifier


  WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

