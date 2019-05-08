package enki.tests.parser;
 
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.trollheim.lang.EnkiLexer;
import org.trollheim.lang.EnkiParser;


import enki.visitor.impl.TestVisitorImpl;

public class EnkParserTests {

 
	@Test
	public void typdeDefinition(){
		String[] expressions = {
		                      "",
		                      "typedef Null = Base()",
		                      "typedef Storage = Base({ a:Num, b:Str, c:func <Num -> Num> })",
		                      "typedef Storage = Base({ a:Num,b:Str})"


		};
		for (String expression : expressions){
			assert  0 == parse(expression);
		}
		
	}
	


 
	
	int parse(String expression){
		EnkiLexer lexer = new EnkiLexer(CharStreams.fromString(expression));
		EnkiParser parser = new EnkiParser(new CommonTokenStream(lexer));
		SyntaxErrorListener s = new SyntaxErrorListener();
		parser.addErrorListener(s );
		TestVisitorImpl v = new TestVisitorImpl();
//		ProgramContext program = parser.program();
		System.out.println(parser.program().getText());
//		v.visitProgram(parser.program());
	 
		return parser.getNumberOfSyntaxErrors()+s.getSyntaxErrors().size();
 
	}
}
