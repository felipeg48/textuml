/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AGreaterOrEqualsComparisonBinaryOperator extends PComparisonBinaryOperator
{
    private TRab _rab_;
    private TEquals _equals_;

    public AGreaterOrEqualsComparisonBinaryOperator()
    {
        // Constructor
    }

    public AGreaterOrEqualsComparisonBinaryOperator(
        @SuppressWarnings("hiding") TRab _rab_,
        @SuppressWarnings("hiding") TEquals _equals_)
    {
        // Constructor
        setRab(_rab_);

        setEquals(_equals_);

    }

    @Override
    public Object clone()
    {
        return new AGreaterOrEqualsComparisonBinaryOperator(
            cloneNode(this._rab_),
            cloneNode(this._equals_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterOrEqualsComparisonBinaryOperator(this);
    }

    public TRab getRab()
    {
        return this._rab_;
    }

    public void setRab(TRab node)
    {
        if(this._rab_ != null)
        {
            this._rab_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rab_ = node;
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
            + toString(this._rab_)
            + toString(this._equals_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rab_ == child)
        {
            this._rab_ = null;
            return;
        }

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
        if(this._rab_ == oldChild)
        {
            setRab((TRab) newChild);
            return;
        }

        if(this._equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
