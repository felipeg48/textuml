/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AUnorderedMultiplicityConstraint extends PMultiplicityConstraint
{
    private TUnordered _unordered_;

    public AUnorderedMultiplicityConstraint()
    {
        // Constructor
    }

    public AUnorderedMultiplicityConstraint(
        @SuppressWarnings("hiding") TUnordered _unordered_)
    {
        // Constructor
        setUnordered(_unordered_);

    }

    @Override
    public Object clone()
    {
        return new AUnorderedMultiplicityConstraint(
            cloneNode(this._unordered_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnorderedMultiplicityConstraint(this);
    }

    public TUnordered getUnordered()
    {
        return this._unordered_;
    }

    public void setUnordered(TUnordered node)
    {
        if(this._unordered_ != null)
        {
            this._unordered_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unordered_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unordered_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unordered_ == child)
        {
            this._unordered_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unordered_ == oldChild)
        {
            setUnordered((TUnordered) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
