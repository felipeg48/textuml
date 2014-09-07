/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AEqualsComparisonBinaryOperator extends PComparisonBinaryOperator
{
    private TEquals _equals_;

    public AEqualsComparisonBinaryOperator()
    {
        // Constructor
    }

    public AEqualsComparisonBinaryOperator(
        @SuppressWarnings("hiding") TEquals _equals_)
    {
        // Constructor
        setEquals(_equals_);

    }

    @Override
    public Object clone()
    {
        return new AEqualsComparisonBinaryOperator(
            cloneNode(this._equals_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualsComparisonBinaryOperator(this);
    }

    public TEquals getEquals()
    {
        return this._equals_;
    }

    public void setEquals(TEquals node)
    {
        if(this._equals_ != null)
        {
            this._equals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equals_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._equals_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._equals_ == child)
        {
            this._equals_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
