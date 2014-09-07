/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AUniqueMultiplicityConstraint extends PMultiplicityConstraint
{
    private TUnique _unique_;

    public AUniqueMultiplicityConstraint()
    {
        // Constructor
    }

    public AUniqueMultiplicityConstraint(
        @SuppressWarnings("hiding") TUnique _unique_)
    {
        // Constructor
        setUnique(_unique_);

    }

    @Override
    public Object clone()
    {
        return new AUniqueMultiplicityConstraint(
            cloneNode(this._unique_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUniqueMultiplicityConstraint(this);
    }

    public TUnique getUnique()
    {
        return this._unique_;
    }

    public void setUnique(TUnique node)
    {
        if(this._unique_ != null)
        {
            this._unique_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unique_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unique_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unique_ == child)
        {
            this._unique_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unique_ == oldChild)
        {
            setUnique((TUnique) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
