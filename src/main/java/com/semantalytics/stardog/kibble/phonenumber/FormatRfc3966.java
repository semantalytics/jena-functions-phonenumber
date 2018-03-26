package com.semantalytics.stardog.kibble.phonenumber;

import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.UserDefinedFunction;
import org.openrdf.model.Value;

public final class FormatRfc3966 extends AbstractFunction implements UserDefinedFunction {

    protected FormatRfc3966() {
        super(2, PhoneNumberVocabulary.formatRfc3966.stringValue());
    }

    private FormatRfc3966(final FormatRfc3966 formatRfc3966) {
        super(formatRfc3966);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {
      
        return null;
    }

    @Override
    public FormatRfc3966 copy() {
        return new FormatRfc3966(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return PhoneNumberVocabulary.formatRfc3966.name();
    }
}
