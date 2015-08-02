/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AOperationHeader extends POperationHeader
{
    private POperationKeyword _operationKeyword_;
    private PWildcardTypes _wildcardTypes_;
    private TIdentifier _identifier_;
    private PSignature _signature_;

    public AOperationHeader()
    {
        // Constructor
    }

    public AOperationHeader(
        @SuppressWarnings("hiding") POperationKeyword _operationKeyword_,
        @SuppressWarnings("hiding") PWildcardTypes _wildcardTypes_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") PSignature _signature_)
    {
        // Constructor
        setOperationKeyword(_operationKeyword_);

        setWildcardTypes(_wildcardTypes_);

        setIdentifier(_identifier_);

        setSignature(_signature_);

    }

    @Override
    public Object clone()
    {
        return new AOperationHeader(
            cloneNode(this._operationKeyword_),
            cloneNode(this._wildcardTypes_),
            cloneNode(this._identifier_),
            cloneNode(this._signature_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOperationHeader(this);
    }

    public POperationKeyword getOperationKeyword()
    {
        return this._operationKeyword_;
    }

    public void setOperationKeyword(POperationKeyword node)
    {
        if(this._operationKeyword_ != null)
        {
            this._operationKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operationKeyword_ = node;
    }

    public PWildcardTypes getWildcardTypes()
    {
        return this._wildcardTypes_;
    }

    public void setWildcardTypes(PWildcardTypes node)
    {
        if(this._wildcardTypes_ != null)
        {
            this._wildcardTypes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wildcardTypes_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public PSignature getSignature()
    {
        return this._signature_;
    }

    public void setSignature(PSignature node)
    {
        if(this._signature_ != null)
        {
            this._signature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._signature_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operationKeyword_)
            + toString(this._wildcardTypes_)
            + toString(this._identifier_)
            + toString(this._signature_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operationKeyword_ == child)
        {
            this._operationKeyword_ = null;
            return;
        }

        if(this._wildcardTypes_ == child)
        {
            this._wildcardTypes_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._signature_ == child)
        {
            this._signature_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operationKeyword_ == oldChild)
        {
            setOperationKeyword((POperationKeyword) newChild);
            return;
        }

        if(this._wildcardTypes_ == oldChild)
        {
            setWildcardTypes((PWildcardTypes) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._signature_ == oldChild)
        {
            setSignature((PSignature) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}