/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AAssociationHeader extends PAssociationHeader
{
    private PAssociationKind _associationKind_;
    private TIdentifier _identifier_;

    public AAssociationHeader()
    {
        // Constructor
    }

    public AAssociationHeader(
        @SuppressWarnings("hiding") PAssociationKind _associationKind_,
        @SuppressWarnings("hiding") TIdentifier _identifier_)
    {
        // Constructor
        setAssociationKind(_associationKind_);

        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AAssociationHeader(
            cloneNode(this._associationKind_),
            cloneNode(this._identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssociationHeader(this);
    }

    public PAssociationKind getAssociationKind()
    {
        return this._associationKind_;
    }

    public void setAssociationKind(PAssociationKind node)
    {
        if(this._associationKind_ != null)
        {
            this._associationKind_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._associationKind_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._associationKind_)
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._associationKind_ == child)
        {
            this._associationKind_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._associationKind_ == oldChild)
        {
            setAssociationKind((PAssociationKind) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
