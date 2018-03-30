package com.github.mizzlr.halsteadmetrics.parser;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Tokenizer {
	public ArrayList<String> tokens;
	protected static Tokenizer instance;
	public static String fileType = null;

	private Tokenizer() {
		this.tokens = new ArrayList<String>();
	}

	public static Tokenizer getInstance() {
		if (instance == null) {
			instance = new Tokenizer();
		}
		return instance;
	}

	public void tokenize(String fileURL) throws IOException {
		TokenStream token = null;
		ANTLRFileStream stream = new ANTLRFileStream(fileURL);

		Java8Lexer jlexer = new Java8Lexer(stream);
		CommonTokenStream jtokenStream = new CommonTokenStream(jlexer);
		Java8Parser jparser = new Java8Parser(jtokenStream);
		jparser.compilationUnit();
		token = jparser.getTokenStream();

		for (int i = 0; i < token.size(); i++) {
			this.tokens.add(token.get(i).getText().toString());
		}
	}
}
