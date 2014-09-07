/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class ANewIdentifierExpression extends PIdentifierExpression
{
    private TNew _new_;
    private PMinimalTypeIdentifier _minimalTypeIdentifier_;

    public ANewIdentifierExpression()
    {
        // Constructor
    }

    public ANewIdentifierExpression(
        @SuppressWarnings("hiding") TNew _new_,
        @SuppressWarnings("hiding") PMinimalTypeIdentifier _minimalTypeIdentifier_)
    {
        // Constructor
        setNew(_new_);

        setMinimalTypeIdentifier(_minimalTypeIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new ANewIdentifierExpression(
            cloneNode(this._new_),
            cloneNode(this._minimalTypeIdentifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewIdentifierExpression(this);
    }

    public TNew getNew()
    {
        return this._new_;
    }

    public void setNew(TNew node)
    {
        if(this._new_ != null)
        {
            this._new_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._new_ = node;
    }

    public PMinimalTypeIdentifier getMinimalTypeIdentifier()
    {
        return this._minimalTypeIdentifier_;
    }

    public void setMinimalTypeIdentifier(PMinimalTypeIdentifier node)
    {
        if(this._minimalTypeIdentifier_ != null)
        {
            this._minimalTypeIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minimalTypeIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._new_)
            + toString(this._minimalTypeIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._new_ == child)
        {
            this._new_ = null;
            return;
        }

        if(this._minimalTypeIdentifier_ == child)
        {
            this._minimalTypeIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._new_ == oldChild)
        {
            setNew((TNew) newChild);
            return;
        }

        if(this._minimalTypeIdentifier_ == oldChild)
        {
            setMinimalTypeIdentifier((PMinimalTypeIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
