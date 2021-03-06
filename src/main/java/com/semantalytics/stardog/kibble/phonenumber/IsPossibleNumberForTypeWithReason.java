package com.semantalytics.stardog.kibble.phonenumber;

import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.UserDefinedFunction;
import org.openrdf.model.Value;

public final class IsPossibleNumberForTypeWithReason extends AbstractFunction implements UserDefinedFunction {

    protected IsPossibleNumberForTypeWithReason() {
        super(2, PhoneNumberVocabulary.isPossibleNumberForTypeWithReason.stringValue());
    }

    private IsPossibleNumberForTypeWithReason(final IsPossibleNumberForTypeWithReason isPossibleNumberForTypeWithReason) {
        super(isPossibleNumberForTypeWithReason);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {
      
        return null;
    }

    @Override
    public IsPossibleNumberForTypeWithReason copy() {
        return new IsPossibleNumberForTypeWithReason(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return PhoneNumberVocabulary.isPossibleNumberForTypeWithReason.name();
    }
}
