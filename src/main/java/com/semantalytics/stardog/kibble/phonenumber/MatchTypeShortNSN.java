package com.semantalytics.stardog.kibble.phonenumber;

import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.Function;
import com.complexible.stardog.plan.filter.functions.UserDefinedFunction;
import org.openrdf.model.Value;

public final class MatchTypeShortNSN extends AbstractFunction implements UserDefinedFunction {

    protected MatchTypeShortNSN() {
        super(2, PhoneNumberVocabulary.matchTypeShortNSN.stringValue());
    }

    private MatchTypeShortNSN(final MatchTypeShortNSN matchTypeShortNSN) {
        super(matchTypeShortNSN);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {
      
        return null;
    }

    @Override
    public Function copy() {
        return new MatchTypeShortNSN(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return PhoneNumberVocabulary.matchTypeShortNSN.name();
    }
}
