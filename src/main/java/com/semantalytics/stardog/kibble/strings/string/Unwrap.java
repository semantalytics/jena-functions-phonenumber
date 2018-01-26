package com.semantalytics.stardog.kibble.strings.string;

import com.complexible.common.rdf.model.Values;
import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.string.StringFunction;
import org.apache.commons.lang3.StringUtils;
import org.openrdf.model.Value;

public final class Unwrap extends AbstractFunction implements StringFunction {

    protected Unwrap() {
        super(2, StringVocabulary.unwrap.stringValue());
    }

    private Unwrap(final Unwrap unWrap) {
        super(unWrap);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {
      
      final String string = assertStringLiteral(values[0]).stringValue();
      final String wrapToken = assertStringLiteral(values[1]).stringValue();
      
      return Values.literal(StringUtils.unwrap(string, wrapToken));
    }

    @Override
    public Unwrap copy() {
        return new Unwrap(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return StringVocabulary.unwrap.name();
    }
}
