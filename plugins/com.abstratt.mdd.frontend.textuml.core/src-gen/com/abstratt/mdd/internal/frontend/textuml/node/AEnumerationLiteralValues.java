/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AEnumerationLiteralValues extends PEnumerationLiteralValues
{
    private TLParen _lParen_;
    private PNamedArgumentList _namedArgumentList_;
    private TRParen _rParen_;

    public AEnumerationLiteralValues()
    {
        // Constructor
    }

    public AEnumerationLiteralValues(
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PNamedArgumentList _namedArgumentList_,
        @SuppressWarnings("hiding") TRParen _rParen_)
    {
        // Constructor
        setLParen(_lParen_);

        setNamedArgumentList(_namedArgumentList_);

        setRParen(_rParen_);

    }

    @Override
    public Object clone()
    {
        return new AEnumerationLiteralValues(
            cloneNode(this._lParen_),
            cloneNode(this._namedArgumentList_),
            cloneNode(this._rParen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumerationLiteralValues(this);
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public PNamedArgumentList getNamedArgumentList()
    {
        return this._namedArgumentList_;
    }

    public void setNamedArgumentList(PNamedArgumentList node)
    {
        if(this._namedArgumentList_ != null)
        {
            this._namedArgumentList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._namedArgumentList_ = node;
    }

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lParen_)
            + toString(this._namedArgumentList_)
            + toString(this._rParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._namedArgumentList_ == child)
        {
            this._namedArgumentList_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._namedArgumentList_ == oldChild)
        {
            setNamedArgumentList((PNamedArgumentList) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
