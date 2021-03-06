package enki.visitor.impl;

import org.trollheim.lang.EnkiBaseVisitor;
import org.trollheim.lang.EnkiParser.BaseTypeContext;
import org.trollheim.lang.EnkiParser.F_types_inContext;
import org.trollheim.lang.EnkiParser.F_types_outContext;
import org.trollheim.lang.EnkiParser.FuncdefsContext;
import org.trollheim.lang.EnkiParser.ProgramContext;
import org.trollheim.lang.EnkiParser.TypeContext;
import org.trollheim.lang.EnkiParser.Type_functionContext;
import org.trollheim.lang.EnkiParser.TypeargumentContext;
import org.trollheim.lang.EnkiParser.TypeargumentsContext;
import org.trollheim.lang.EnkiParser.TypedefContext; 

public class TestVisitorImpl extends EnkiBaseVisitor<Object>{

 

	 

	@Override
	public Object visitProgram(ProgramContext ctx) {
		System.out.println("visitProgram");
		if (ctx.typedef() != null){
			System.out.println("typedef "+ctx.typedef().size());
			ctx.typedef().forEach(this::visitTypedef);
		}
		if (ctx.funcdefs() != null) {
			System.out.println("funcdefs "+ctx.funcdefs().size());
	 		ctx.funcdefs().forEach(this::visitFuncdefs);
		}

		if (ctx.children !=null)
			System.out.println("children");

		System.out.println("visitProgram+ "+ctx.getText());
		return super.visitProgram(ctx);
	}

	@Override
	public Object visitTypedef(TypedefContext ctx) {
		System.out.println("visitTypedef "+ctx.getText());
		System.out.println("id = "+ctx.TypeId().getText()+ "::");
		if (ctx.baseType()!=null){
			visitBaseType(ctx.baseType());
		}
		
		if (ctx.typearguments()!=null){
			visitTypearguments(ctx.typearguments());
		}
		return super.visitTypedef(ctx);
	}

	@Override
	public Object visitFuncdefs(FuncdefsContext ctx) {
		System.out.println( "F id" +ctx.Id());
		System.out.println(ctx.type_function().getText());
		return super.visitFuncdefs(ctx);
	}

	@Override
	public Object visitTypearguments(TypeargumentsContext ctx) {
		if (ctx.typeargument()!=null)
			ctx.typeargument().forEach(this::visitTypeargument);
		return super.visitTypearguments(ctx);
	}

	@Override
	public Object visitTypeargument(TypeargumentContext ctx) {
		System.out.println("visitTypeargument::"+ctx.getText());
		System.out.println("id ::::" + ctx.Id());
		visitType(ctx.type());
		return super.visitTypeargument(ctx);
	}

	@Override
	public Object visitBaseType(BaseTypeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBaseType(ctx);
	}

	@Override
	public Object visitType(TypeContext ctx) {
		System.out.println("visitType");
		if(ctx.type_function()!=null){
			visitType_function(ctx.type_function());
		}
			
		return super.visitType(ctx);
	}

	@Override
	public Object visitType_function(Type_functionContext ctx) {
		System.out.println("visitType_function");
		return super.visitType_function(ctx);
	}

	@Override
	public Object visitF_types_out(F_types_outContext ctx) {
		// TODO Auto-generated method stub
		return super.visitF_types_out(ctx);
	}

	@Override
	public Object visitF_types_in(F_types_inContext ctx) {
		// TODO Auto-generated method stub
		return super.visitF_types_in(ctx);
	}



}
