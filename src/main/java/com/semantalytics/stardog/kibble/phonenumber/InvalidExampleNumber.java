package com.semantalytics.stardog.kibble.phonenumber;

import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.UserDefinedFunction;
import org.openrdf.model.Value;

public final class InvalidExampleNumber extends AbstractFunction implements UserDefinedFunction {

    protected InvalidExampleNumber() {
        super(2, PhoneNumberVocabulary.invalidExampleNumber.stringValue());
    }

    private InvalidExampleNumber(final InvalidExampleNumber invalidExampleNumber) {
        super(invalidExampleNumber);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {
      
        return null;
    }

    @Override
    public InvalidExampleNumber copy() {
        return new InvalidExampleNumber(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return PhoneNumberVocabulary.invalidExampleNumber.name();
    }
}
