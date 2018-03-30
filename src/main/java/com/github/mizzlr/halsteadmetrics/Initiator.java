package com.github.mizzlr.halsteadmetrics;

import com.github.mizzlr.halsteadmetrics.analyzers.BracesAnalyzer;
import com.github.mizzlr.halsteadmetrics.analyzers.KeywordAnalyzer;
import com.github.mizzlr.halsteadmetrics.analyzers.LiteralAnalyzer;
import com.github.mizzlr.halsteadmetrics.analyzers.SymbolAnalyzer;
import com.github.mizzlr.halsteadmetrics.models.Operands;
import com.github.mizzlr.halsteadmetrics.models.Operators;
import com.github.mizzlr.halsteadmetrics.parser.Tokenizer;

public class Initiator {

	public MetricsEvaluator initiate(String fileURL) throws Exception {
		// TODO Auto-generated method stub
		Operators.getInstance().count.clear();
		Operators.getInstance().name.clear();
		Operands.getInstance().name.clear();
		Operands.getInstance().count.clear();
		Tokenizer.getInstance().tokenize(fileURL);
		KeywordAnalyzer ka=new KeywordAnalyzer();
		ka.analyzeKeywords();
		SymbolAnalyzer sa=new SymbolAnalyzer();
		sa.analyzeSymbols();
		BracesAnalyzer ba=new BracesAnalyzer();
		ba.analyzeBraces();
		LiteralAnalyzer la=new LiteralAnalyzer();
		la.analyzeLiterals();
		MetricsEvaluator me=new MetricsEvaluator();
		me.evaluate();
		return me;
	}

}
