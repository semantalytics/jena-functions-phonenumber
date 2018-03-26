package com.semantalytics.stardog.kibble.phonenumber;

import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.UserDefinedFunction;
import org.openrdf.model.Value;

public final class IsMobileNumberPortableRegion extends AbstractFunction implements UserDefinedFunction {

    protected IsMobileNumberPortableRegion() {
        super(2, PhoneNumberVocabulary.isMobileNumberPortableRegion.stringValue());
    }

    private IsMobileNumberPortableRegion(final IsMobileNumberPortableRegion isMobileNumberPortableRegion) {
        super(isMobileNumberPortableRegion);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {
      
        return null;
    }

    @Override
    public IsMobileNumberPortableRegion copy() {
        return new IsMobileNumberPortableRegion(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return PhoneNumberVocabulary.isMobileNumberPortableRegion.name();
    }
}
