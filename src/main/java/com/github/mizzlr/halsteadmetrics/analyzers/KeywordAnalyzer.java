package com.github.mizzlr.halsteadmetrics.analyzers;

import com.github.mizzlr.halsteadmetrics.parser.Java8Keywords;
import com.github.mizzlr.halsteadmetrics.models.Operands;
import com.github.mizzlr.halsteadmetrics.models.Operators;
import com.github.mizzlr.halsteadmetrics.parser.Tokenizer;

public class KeywordAnalyzer {
	public void analyzeKeywords() {
		for (int i = 0; i < Tokenizer.getInstance().tokens.size(); i++) {
			if (Java8Keywords.isKeyword(Tokenizer.getInstance().tokens.get(i).toString())) {
				Operators.getInstance().insert(Tokenizer.getInstance().tokens.get(i).toString());
			} else if (Tokenizer.getInstance().tokens.get(i).toString().charAt(0) == '"') {
				Operands.getInstance().insert(Tokenizer.getInstance().tokens.get(i).toString());
			}
		}
	}
}
