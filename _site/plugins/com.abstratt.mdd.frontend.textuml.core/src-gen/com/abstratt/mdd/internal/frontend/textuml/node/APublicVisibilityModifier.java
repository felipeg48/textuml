/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class APublicVisibilityModifier extends PVisibilityModifier
{
    private TPublic _public_;

    public APublicVisibilityModifier()
    {
        // Constructor
    }

    public APublicVisibilityModifier(
        @SuppressWarnings("hiding") TPublic _public_)
    {
        // Constructor
        setPublic(_public_);

    }

    @Override
    public Object clone()
    {
        return new APublicVisibilityModifier(
            cloneNode(this._public_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPublicVisibilityModifier(this);
    }

    public TPublic getPublic()
    {
        return this._public_;
    }

    public void setPublic(TPublic node)
    {
        if(this._public_ != null)
        {
            this._public_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._public_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._public_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._public_ == child)
        {
            this._public_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._public_ == oldChild)
        {
            setPublic((TPublic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
