/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.internal.frontend.textuml.node;

import com.abstratt.mdd.internal.frontend.textuml.analysis.*;

@SuppressWarnings("nls")
public final class AEnumerationLiteralDecl extends PEnumerationLiteralDecl
{
    private TModelComment _modelComment_;
    private TIdentifier _identifier_;

    public AEnumerationLiteralDecl()
    {
        // Constructor
    }

    public AEnumerationLiteralDecl(
        @SuppressWarnings("hiding") TModelComment _modelComment_,
        @SuppressWarnings("hiding") TIdentifier _identifier_)
    {
        // Constructor
        setModelComment(_modelComment_);

        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AEnumerationLiteralDecl(
            cloneNode(this._modelComment_),
            cloneNode(this._identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumerationLiteralDecl(this);
    }

    public TModelComment getModelComment()
    {
        return this._modelComment_;
    }

    public void setModelComment(TModelComment node)
    {
        if(this._modelComment_ != null)
        {
            this._modelComment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._modelComment_ = node;
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
            + toString(this._modelComment_)
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modelComment_ == child)
        {
            this._modelComment_ = null;
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
        if(this._modelComment_ == oldChild)
        {
            setModelComment((TModelComment) newChild);
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
