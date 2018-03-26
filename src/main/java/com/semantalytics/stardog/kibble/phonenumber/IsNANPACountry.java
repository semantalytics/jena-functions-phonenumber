package com.semantalytics.stardog.kibble.phonenumber;

import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.UserDefinedFunction;
import org.openrdf.model.Value;

public final class IsNANPACountry extends AbstractFunction implements UserDefinedFunction {

    protected IsNANPACountry() {
        super(2, PhoneNumberVocabulary.isNANPACountry.stringValue());
    }

    private IsNANPACountry(final IsNANPACountry isNANPACountry) {
        super(isNANPACountry);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {
      
        return null;
    }

    @Override
    public IsNANPACountry copy() {
        return new IsNANPACountry(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return PhoneNumberVocabulary.isNANPACountry.name();
    }
}
