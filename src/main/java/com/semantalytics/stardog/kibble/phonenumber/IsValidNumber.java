package com.semantalytics.stardog.kibble.phonenumber;

import com.complexible.stardog.plan.filter.ExpressionEvaluationException;
import com.complexible.stardog.plan.filter.ExpressionVisitor;
import com.complexible.stardog.plan.filter.functions.AbstractFunction;
import com.complexible.stardog.plan.filter.functions.UserDefinedFunction;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.openrdf.model.Value;

import static com.complexible.common.rdf.model.Values.literal;
import static com.google.i18n.phonenumbers.Phonenumber.*;

public class IsValidNumber extends AbstractFunction implements UserDefinedFunction {

    private final PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
    private final PhoneNumber phoneNumber = new PhoneNumber();

    protected IsValidNumber() {
        super(1, PhoneNumberVocabulary.isValidNumber.stringValue());
    }

    public IsValidNumber(final IsValidNumber isValidNumber) {
        super(isValidNumber);
    }

    @Override
    protected Value internalEvaluate(final Value... values) throws ExpressionEvaluationException {

        final String number = assertStringLiteral(values[0]).stringValue();
        final String regionCode = assertStringLiteral(values[1]).stringValue();

        try {

            phoneNumberUtil.parse(number, regionCode, phoneNumber);
            return literal(phoneNumberUtil.isValidNumber(phoneNumber));

        } catch (NumberParseException e) {
            throw new ExpressionEvaluationException(e);
        }
    }

    @Override
    public IsValidNumber copy() {
        return new IsValidNumber(this);
    }

    @Override
    public void accept(final ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    @Override
    public String toString() {
        return PhoneNumberVocabulary.isValidNumber.name();
    }
}
