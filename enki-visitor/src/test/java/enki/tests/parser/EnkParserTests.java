package enki.tests.parser;
 
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.junit.Assert;
import org.junit.Test;
import org.trollheim.lang.EnkiLexer;
import org.trollheim.lang.EnkiParser;
import org.trollheim.lang.EnkiParser.My_ruleContext;
import org.trollheim.lang.EnkiParser.ProgramContext;

import enki.visitor.impl.TestVisitorImpl;

public class EnkParserTests {

 
	@Test
	public void typdeDefinition(){
		String[] expressions = {
		                      "",
//		                      "typedef Null = Base()",
		                      "typedef Storage = Base({ a:Num, b:Str, c:func <Num -> Num> })",
//		                      "typedef Storage = Base({ a:Num,b:Str})",
//		                      "aaas ;;;as;"
		                      
		};
		for (String expression : expressions){
			 System.out.println(expression+" "+parse(expression));
		}
		
	}
	

//	@Test
	public void typdeDefinition2(){
		String[] expressions = {
		                      "func < a -> b >" 
		                      
		};
		for (String expression : expressions){
			 System.out.println(expression+" "+parse2(expression));
		}
		
	}
	
	int parse2(String expression){
		EnkiLexer lexer = new EnkiLexer(CharStreams.fromString(expression));
		EnkiParser parser = new EnkiParser(new CommonTokenStream(lexer));
		SyntaxErrorListener s = new SyntaxErrorListener();
		parser.addErrorListener(s );
		  My_ruleContext program = parser.my_rule();
		  System.out.println(s.getSyntaxErrors());
		return s.getSyntaxErrors().size();
 
	}

 
	
	int parse(String expression){
		EnkiLexer lexer = new EnkiLexer(CharStreams.fromString(expression));
		EnkiParser parser = new EnkiParser(new CommonTokenStream(lexer));
//		SyntaxErrorListener s = new SyntaxErrorListener();
//		parser.addErrorListener(s );
		TestVisitorImpl v = new TestVisitorImpl();
//		ProgramContext program = parser.program();
		v.visitProgram(parser.program());
	 
		return parser.getNumberOfSyntaxErrors();//+s.getSyntaxErrors().size();
 
	}
}
