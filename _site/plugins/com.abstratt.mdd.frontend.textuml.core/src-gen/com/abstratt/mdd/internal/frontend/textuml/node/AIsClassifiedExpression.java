/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AIsClassifiedExpression extends PExpression
{
    private PExpression _expression_;
    private TIs _is_;
    private PQualifiedIdentifier _qualifiedIdentifier_;

    public AIsClassifiedExpression()
    {
        // Constructor
    }

    public AIsClassifiedExpression(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TIs _is_,
        @SuppressWarnings("hiding") PQualifiedIdentifier _qualifiedIdentifier_)
    {
        // Constructor
        setExpression(_expression_);

        setIs(_is_);

        setQualifiedIdentifier(_qualifiedIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new AIsClassifiedExpression(
            cloneNode(this._expression_),
            cloneNode(this._is_),
            cloneNode(this._qualifiedIdentifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIsClassifiedExpression(this);
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TIs getIs()
    {
        return this._is_;
    }

    public void setIs(TIs node)
    {
        if(this._is_ != null)
        {
            this._is_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._is_ = node;
    }

    public PQualifiedIdentifier getQualifiedIdentifier()
    {
        return this._qualifiedIdentifier_;
    }

    public void setQualifiedIdentifier(PQualifiedIdentifier node)
    {
        if(this._qualifiedIdentifier_ != null)
        {
            this._qualifiedIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qualifiedIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_)
            + toString(this._is_)
            + toString(this._qualifiedIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._is_ == child)
        {
            this._is_ = null;
            return;
        }

        if(this._qualifiedIdentifier_ == child)
        {
            this._qualifiedIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._is_ == oldChild)
        {
            setIs((TIs) newChild);
            return;
        }

        if(this._qualifiedIdentifier_ == oldChild)
        {
            setQualifiedIdentifier((PQualifiedIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
